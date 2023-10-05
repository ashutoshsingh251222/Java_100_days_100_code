import java.util.*;
class Binary_pyramid {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Rows here: ");
        int row= sc.nextInt();
        int sum;
        for(int i = 0;i<=row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                sum=i+j;
                if(sum%2==0)
                {
                    System.out.print(" 0 ");
                }
                else
                {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }




    }
}
