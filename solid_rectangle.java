import java.util.Scanner;

class Solid {
    public static void main(String args[]) {

        System.out.println("HEy Lets Print Some patters:");
        Scanner num = new Scanner(System.in);
        System.out.print("Enetr the number of rows here: ");
        int sc = num.nextInt();
        for (int i = 1; i <= sc; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}