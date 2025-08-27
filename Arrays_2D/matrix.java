package Arrays_2D;
import java.util.*;

public class matrix {

    public static void largestNum(int mat[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] > max){
                  max = mat[i][j];
                    
                }
            }
        }
        System.out.println("Largest number in the array is " + max);


    }

     public static void smallestNum(int mat[][]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] < min){
                  min = mat[i][j];
                    
                }
            }
        }
        System.out.println("Smallest number in the array is " + min);


    }

    public static boolean search(int mat[][], int key){
        
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == key){
                    System.out.println("Found at cell  (" + i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;

    }
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int n = mat.length; int m = mat[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();;
        }

        //search(mat,5);
        largestNum(mat);
        smallestNum(mat);


        sc.close();
    }

    
}
