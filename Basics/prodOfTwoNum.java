
package Basics;
import java.util.*;



public class prodOfTwoNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int a = sc.nextInt();
    System.out.println("Enter the second number : ");
    int b = sc.nextInt();
    int prod = a*b;
    System.out.println("The product of two numbers is : "+ prod);

    sc.close();


}
 }