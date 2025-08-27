package Functions;

public class decToBin {
    public static void dectoBin(int n){
      int myNum = n;
        int pow = 0;
      int binNum = 0;
      
      while(n>0){
        int rem = n%2;
        binNum = binNum + (int) (rem * Math.pow(10,pow));

        pow++;
        n = n/2;
      }
      System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        dectoBin(12);
    }


}
