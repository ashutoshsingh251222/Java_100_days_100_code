// Print the Patter
import java.util.*;

public class class35_practice8 {
    static void Print(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arge[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Print(n);
    }
}
