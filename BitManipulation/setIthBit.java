package BitManipulation;

public class setIthBit {
    public static int set_ithBit(int n , int i){
        int bitMask = 1<<i;
       return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(set_ithBit(10, 2));
    }
}
