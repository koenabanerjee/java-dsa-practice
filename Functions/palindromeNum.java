package Functions;

public class palindromeNum {

    public static int reverseNum(int n){
        int rev_num = 0;
        int digit;
        while(n>0){
            digit = n%10;
            rev_num = rev_num*10 + digit;
            n = n/10;

        }
        return rev_num;
    }



    public static void palindromeChecker(int n){
        if( n == reverseNum(n)){
            System.out.println("The number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        };


    }

    public static void main(String[] args) {
        palindromeChecker(1234);
        palindromeChecker(121);
    }
}
