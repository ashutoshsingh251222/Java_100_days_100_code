class Shape
{
    void shape()
    {
        System.out.println("The shape of product is:");
    }
}
 class Triangle extends Shape
 {
    void printShape ( )
    {
        System.out.println("Triangle");
    }

    public void area(double l, double h)
    {
        double area= 1/2*(l*h);
        System.out.println("The area of triangle is:"+area);
    }

 }
 class ET extends Triangle
 {
    public void area ()
    {
        System.out.println("The area of ET is :" );
    }
 }
 class test1
 {
    public static void main (String args[])
    {
        ET et=new ET();
        
        et.printShape();
        et.area(22.00,24.00);
        et.area();

    }
 }