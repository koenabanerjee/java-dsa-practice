package Pattern;

public class starPattern {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){ //no of rows
            for(int j = 1;j<=i;j++){ //no of times stars will be printed
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
