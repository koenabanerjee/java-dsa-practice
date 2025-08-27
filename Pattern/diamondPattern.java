package Pattern;

public class diamondPattern {
    public static void diamondPatt(int n){
        //1ST HALF
        for(int i = 1;i<=n;i++){
            //SPACES
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=2*(i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2ND HALF
        for(int i = n;i>=1;i--){
            //SPACES
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPatt(4);
    }
}
