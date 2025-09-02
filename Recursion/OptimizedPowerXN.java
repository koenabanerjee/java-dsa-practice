package Recursion;

public class OptimizedPowerXN {
    public static int OptimizedPower(int a, int n){
        if( n ==0){
            return 1;
        }

        int halfPower = OptimizedPower(a , n/2);
        int halfPowerSQ =  halfPower * halfPower;

        //n is odd
        if( n%2 !=0){
            halfPowerSQ = a* halfPowerSQ;
        }
        return halfPowerSQ;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(OptimizedPower(a, n));
    }
    
}
