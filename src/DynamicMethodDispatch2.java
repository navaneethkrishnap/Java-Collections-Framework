// DYNAMIC DISPATCH WHY? == 2. PROGRAM TO AN INTERFACE NOT IMPLEMENTATION
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid $: "+amount+" using credit card.");
    }
}

class PaypalPayment  implements  Payment{
    public void pay(double amount){
        System.out.println("Paid $: "+amount+" using Paypal.");
    }
}

class FakePayment implements Payment{

    boolean processPayment = false;

    @Override
    public void pay(double amount) {
        System.out.println("Fake payment %: "+amount);
        processPayment = true;
    }
}


public class DynamicMethodDispatch2 {
    public static void processPayment(Payment payment,double amount){
        payment.pay(amount);
    }

    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        processPayment(p,200);

        p = new PaypalPayment();
        processPayment(p,300);

        FakePayment fake = new FakePayment();
        processPayment(fake, 1000);

        if(fake.processPayment) System.out.println("Test passes");
        else System.out.println("Test failed");
    }
}

