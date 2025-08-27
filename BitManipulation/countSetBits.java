package BitManipulation;

public class countSetBits {
    public static int count_SetBits(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) != 0) { //check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count_SetBits(15));
    }
}
