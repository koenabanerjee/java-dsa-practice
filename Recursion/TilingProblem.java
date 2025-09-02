package Recursion;

public class TilingProblem {
    public static int TilingProb(int n){
        //base case
        if(n == 0 || n==1){
            return 1;
        }

        //work
        //vertical choice
        int fnm1 = TilingProb(n - 1);

        //horizontal choice
        int fnm2 = TilingProb(n-2);

        int  totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(TilingProb(4));
    }
}
