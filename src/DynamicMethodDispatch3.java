// Dynamic method dispatch == 3. OPEN/CLOSED PRINCIPLE ( OCP )


public class DynamicMethodDispatch3 {
}

interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    private double width, height;

    Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    public double area(){
        return width * height;
    }
}

//public class AreaCalculator{
//    public static double totalArea(Shape[] shapes){
//        double total = 0;
//
//        for(Shape s: shapes){
//            total += s.area();
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
