class Bike
{
    String brand;
    String origin;
    int year;
}
class Kawasaki extends Bike // Baby class inheriting parent class
{
    int top_speed=400;
    public void Printinfo()
    {
        System.out.println("The brand of Kawasake is :- " +  "  "+brand);
        System.out.println("The origin of Kawasaki is :- "+  "  "+origin);
        System.out.println("The birth date of Kawasaki is:- "+  "  "+year);
        System.out.println("Kawasaki H2R top speed is "+  "  "+top_speed);
    }

}
class Hunda extends Bike // Baby class inheriting parent class
{
    int top_speed=350;
    public void Printinfo()
    {
        System.out.println("The Brand of Hunda is :-" + "  "+brand);
        System.out.println("The Origin of Hunda is :-" + "  "+origin);
        System.out.println("The Brithday of Hunda is :-" + "  "+year);
        System.out.println("Top speed of CBR1000 is " + "  "+top_speed);
    }
}
class bikes
{
    public static void main (String args[])
    {
        Kawasaki h2 = new Kawasaki();
        h2.brand="Japanese";
        h2.origin="Japanese";
        h2.year=2000;
        Hunda CBR1000= new Hunda();
        CBR1000.brand="Hunda";
        CBR1000.year=2002;
        CBR1000.origin="America";
        CBR1000.top_speed=350;
        h2.Printinfo();
        CBR1000.Printinfo();

    }
}