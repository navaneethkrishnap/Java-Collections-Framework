public class Electricity {

    static double electricCharge(int n){
        return (n * (1.602 * Math.pow(10,-19)));
    }

    static double coulombsLaw(double q1, double q2, double r){
        double cons = 8.988 * Math.pow(10,9);
        return cons * ((q1 * q2)/ Math.pow(r,2));
    }
}
