package BitManipulation;

public class getIthBit {
    public static int get_ithBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(get_ithBit(10, 2));
    }
    
}
