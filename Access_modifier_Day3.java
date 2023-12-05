import java.util.Scanner;

class Circle 
{
    private int r;
    public int  getR()
    {
        return r;
    }
    public void setR(int a)
    {
        this.r=a;
    }
    public double giveR(int a)
    {
        return 3.14*a*a;
    }
    public double givrP(int a)
    {
        return 2*3.14*a;
    }
}






public class Access_modifier_Day3 {
    public static void main(String[] args )
    {
        Circle c=new Circle();
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        c.setR(a);
        c.givrP(a);
        c.giveR(a);
        System.out.println(c.giveR(a));
        System.out.println(c.givrP(a));
        System.out.println();

    }
    
}
