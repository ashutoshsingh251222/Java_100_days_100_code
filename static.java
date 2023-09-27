class Student
{
    static String school;
    String name;
    int roll_num;
    String section;
    public void printInfo()
    {
        System.out.println("The name of student is: "+name);
        System.out.println("The School name  of student is: "+school);
        System.out.println("The Roll num of student is: "+roll_num);
        System.out.println("The section of Student is: "+section);
    }
}
class Ram
{
    public static void main(String args[])
    {
        Student ram= new Student();
        ram.name="Ashu";
        ram.school="MJS";
        ram.roll_num=25;
        ram.section="A";
        ram.printInfo();
        Student shyam= new Student();
        shyam.name="Rishi";// Here we dont need to define school as school is a static keyword which cannt be changed within the whole code 
        shyam.roll_num=255;
        shyam.section="A";
        shyam.printInfo();


    }
}
