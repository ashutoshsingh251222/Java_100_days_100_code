import java.util.*;
class S
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Row of 2D array here: ");
        int row= sc.nextInt();
        System.out.println("Enter the size of Column of 2D array here: ");
        int cols = sc.nextInt();
         int [][] number =  new int [row][cols];
         // Here we are using Nusted Loops for taking the input of Array
        for(int i=0;i<row;i++)
        {
            for(int j= 0;j<cols;j++)
            {
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched: ");
        int x= sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(number[i][j]==x)
                {
                    System.out.println(i+" "+j);
                }
                else
                {
                    System.out.println();
                }
            }
        }

    }
}