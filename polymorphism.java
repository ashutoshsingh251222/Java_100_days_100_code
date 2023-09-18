class Shape
 {
    public void area() {
        System.out.println("The area of ");             // Same function with different parameter 
    }

    public void area(float b, float h) {
        System.out.println("The are of triangle is " + (1/2) * b * h);              
    }

    public void area(int r) {
        System.out.println("The area of circle is " + (3.14) * r * r);          // Same function with different parameter 
    }

}

class OPPS
 {
    public static void main(String args[])
     {
        Shape triangle = new Shape();
        triangle.area(24, 25);
        Shape circle = new Shape();
        circle.area(14);

    }

}
