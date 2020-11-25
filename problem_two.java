import java.io.*;
import java.util.Scanner;

public class staircase_probleem {

    /*
     * Complete the staircase problem function below.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.println("Enter staircase height");
        n = input.nextInt();
        

        for (int i = 0; i <  n; i++) {
            for (int j = n-1, j > 1, j--)
            System.out.println("");
        }
        System.out.println("#");

        System.exit(0);
    }
}
