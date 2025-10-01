// Create a class circle
public class Circle {
    // Set attribute radius
    private double radius;
    // create constructor
    public Circle(double radius)
    {
        this.radius=radius;
    }
    // Method to return circles area
    public double calculateArea()
    {
        // Area of a circle =3.14*radius*radius;
       // Math.pow(base,exponent). Exponential method
        // Math.PI*Math.pow(radius,2)
        return Math.PI*Math.pow(radius,2);
    }
    //Method to return Circles circumference
    public double calculateCircumference()
    {
        // circumference =2*3.14*radius
        return 2*Math.PI*radius;
    }
    // Method to add another circle
    public boolean isBiggerThan( Circle circle2){
        // area of the second circle
        //double area2 = Math.PI*Math.pow(circle2radius,2);
        boolean isBiggerThan =false;
        if (calculateArea()> circle2.calculateArea()){
            isBiggerThan =true;;
        }
        return isBiggerThan;
    }
}
