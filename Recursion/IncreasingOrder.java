package Recursion;

//PRINT NUMBERS FROM n TO 1 (DECREASING ORDER)
public class IncreasingOrder {
   
    public static void printInc( int n){
         if(n == 1){
        System.out.print(n + " ");
        return;
    }
        
        printInc(n-1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
}