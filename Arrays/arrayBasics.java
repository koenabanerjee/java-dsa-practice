package Arrays;
//import java.util.*;

public class arrayBasics {

    public static void update(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i] + 1;

        }
    }
    public static void main(String[] args){
        int marks[] = {97,98,99};
        update(marks);

        //TO PRINT MARKS
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);

        // System.out.println("length of array = "+ marks.length);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();



        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);

        // marks[2] = 100;
        // System.out.println("math : " + marks[2]);

        

        //sc.close();
    }


    
}
