package Pattern;

public class invertedAndRotatedHalfPyramid {
    public static void invertedAndRotatedHalfPyr(int n){
        for(int i = 1;i<=n;i++){
            //SPACES
            for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");

            }
            //STARS
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedAndRotatedHalfPyr(10);
    }
}
