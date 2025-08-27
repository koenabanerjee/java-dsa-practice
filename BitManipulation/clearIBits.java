package BitManipulation;

public class clearIBits {
    public static int clear_IBits(int n, int i){
        int bitMask = (~0)<<i;
         return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_IBits(15, 2));
    }
}
