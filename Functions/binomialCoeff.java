package Functions;

public class binomialCoeff {
    public static int factOfNum(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff (int n, int r){
        int fact_n = factOfNum(n);
        int fact_r = factOfNum(r);
        int fact_nmr = factOfNum(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }



    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = binCoeff(n, r);
        System.out.println("Binomial Coefficient is : "+ result);
    }
}
