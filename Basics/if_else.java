package Basics;
import java.util.*;



public class if_else {
    public static void main(String[] args) {
        // int age= 16;
        // if(age >= 18) {
        //     System.out.println("adult : drive, vote");
        // } else {
        //     System.out.println("Not adult");
        // }


        // int a = 1 , b = 5;
        // if(a>=b){
        //     System.out.println("A is largest of two");
        // } else{
        //     System.out.println("B is largest of two");
        // }



        //CHECKING EVEN OR ODD NUMBER
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }
    
}
