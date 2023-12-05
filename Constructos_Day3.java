class Myemployee
{
String name;
int age;
int salary;
public void Myemployee()
{
    System.out.println(name);
}
public void Myemployee(String s)
{
    System.out.println("Your name is: "+ s);
}
public void Myemployee(String s ,int a)
{
System.out.println("Your name is: "+ s);
System.out.println("Your age is: "+ a);
}
public void Myemployee(String s, int a, int b)

{
    System.out.println("Your name is: "+ s);
    System.out.println("Your age is: "+ a);
    System.out.println("Your salery is: "+ b);
}

}

public class Constructos_Day3 {
    public static void main(String[] args )
    {
        Myemployee ashu = new Myemployee();
        ashu.Myemployee("AShu",24);
        ashu.salary=2454;
        ashu.Myemployee("Ashu",25,10000);
    }
    
}
