package Functions;

public class multiply {
    public static int multiplyNumber(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = multiplyNumber(a, b);
            System.out.println("The product of the two numbers are : " + result);
    }
}
