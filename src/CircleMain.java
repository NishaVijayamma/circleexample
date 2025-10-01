// main method for class Circle
public class CircleMain {
    public static void main(String[] args) {
        // Create an object for class circle
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(2);
        // Call method for area and print area.
        System.out.println(" Area of a circle = " + circle1.calculateArea());
        // call method for circumference and print circumference
        System.out.println(" Circumference of a circle = " + circle1.calculateCircumference());
        // Compare two circles
        if (circle1.isBiggerThan(circle2)) {
            System.out.println("Circle one is bigger than second");
        } else {
            System.out.println("circle 2 is bigger than first circle");
        }
    }
}
