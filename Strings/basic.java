package Strings;
//import java.util.*;

public class basic {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);


        // String fullName = "Koena Banerjee";
        // System.out.println(fullName.length());


        //concatenation
        // String firstName = "Koena ";
        // String lastName = "Banerjee ";
        // String fullName = firstName + ""  + lastName;
        // System.out.println(fullName.charAt(1));

        printLetters("Koena Banerjee");
        

    }
}
