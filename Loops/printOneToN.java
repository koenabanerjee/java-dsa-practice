
package Loops;
import java.util.*;

public class printOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int counter = 1;
        System.out.println("The numbers are : ");
        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
