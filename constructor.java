class XYZ 
{
    String name ;
    String School;
    int roll_num;
    XYZ()                               // This is non-paramaterized constructor 
    {
        System.out.println("COnstructor called by itself");
    }
    XYZ(String name , int roll_num )    // This is parametrized constructor 
    {
        this.name=name;
        this.roll_num=roll_num;
        System.out.println(this.name );
        System.out.println(this.roll_num);
    }


public String getname ()
{
    return name;
} 
public String getSchool()
{
    return School;
}
public int getroll_num()
{
    return roll_num;
}
}
public class constructor {
    public static void main ( String arge[])
    {

    XYZ student1 = new XYZ();
    student1.name="Ashu";
    student1.School="JVM";
    student1.roll_num=554;
    XYZ studen2 = new XYZ("Rishab",54);

   System.out.println(student1.getname() + " " +  student1.getroll_num());



    
   
    }
}
