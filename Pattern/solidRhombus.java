package Pattern;

public class solidRhombus {
    public static void solidRhom(int n){
        for(int i = 1;i<=n;i++){
            //SPACES
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //STARS
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhom(5);
    }
}
