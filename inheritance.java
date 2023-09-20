class Employee 
{
    int sallery;
    
    public void info(float sallary)
    {
        System.out.println("The basic sallary is:-"+sallery);
    }
}

class Programmer extends Employee // This is single level inheritance 
{
    int bonous;
    public void printBonous(int bonous)
    {
        System.out.println("The bonous for this year is:-"+ bonous);
    }
}
class Test {
	public static void main(String args[])
	{
        Programmer e1=new Programmer();
        e1.sallery=25000;
        e1.bonous=5000;
        System.out.println(e1.sallery);
        System.out.println(e1.bonous);
        System.out.println("Total in hand is "+ (e1.sallery+e1.bonous));
	}
}