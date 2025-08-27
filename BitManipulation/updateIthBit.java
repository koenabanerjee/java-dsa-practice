package BitManipulation;

public class updateIthBit {
    public static int clear_ithBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int set_ithBit(int n , int i){
        int bitMask = 1<<i;
       return n | bitMask;
    }


    public static int update_IthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clear_ithBit(n, i);
        // }
        // else {
        //     return set_ithBit(n , i);
        // }

         n = clear_ithBit(n, i);
         int BitMask = newBit << i;
         return n | BitMask;

    }

    public static void main(String[] args) {
        System.out.println(update_IthBit(10, 2, 1));
    }
}
