package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle : ");
    float radius = sc.nextFloat();
    float area = 3.14f * radius * radius;
    System.out.println("The area of the circle is "+ area);

    sc.close();
    }
    
}
