package Recursion;
public class sumOfNo {

    public static int CalcSum(int n){

        if( n ==1 ){
            return 1;
        }
        int Sn = n + CalcSum(n - 1);
        return Sn;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(n));
    }
    
}
