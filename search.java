import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int [] number = new int[size];
        System.out.println("Enter the Array here: ");
        for(int i= 0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the number to see its location: ");
        int x=sc.nextInt();
        for(int i=0;i<size;i++)

        {
            if(x==number[i])
            {
                System.out.println(i);
            }
            else
            {
                
            }

        }
    }
}