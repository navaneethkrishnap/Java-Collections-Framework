
// DYNAMIC DISPATCH WHY ? -- 1. POLYMORPHISM
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}


class Animal{
    void sound(){
        System.out.println("Every animal has unique sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Dog{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

