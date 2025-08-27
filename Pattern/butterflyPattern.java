package Pattern;

public class butterflyPattern {
    public static void butterflyPatt(int n){
        //1st HALF
        for(int i = 1;i<=n; i++){
            //STARS - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES - 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //STARS - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

          

        }

          //2nd HALF
          for(int i = n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES - 2*(n-i)
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //STARS - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          }
    }

    public static void main(String[] args) {
        butterflyPatt(5);
    }
}
