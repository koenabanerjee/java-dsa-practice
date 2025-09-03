package Recursion;

//PRINT ALL BINARY STRINGS OF SIZE n WITHOUT CONSECUTIVE 1's.
public class BinaryStringProb {
    
    public static void printBinStrings (int n, int lastPlace, String str){

        //WORK
        // if(lastPlace == 0){
        //     //SIT 0 ON CHAIR n
        //    printBinStrings(n-1, 0, str.append("0"));
        //    printBinStrings(n-1, 1, str.append("1"));
        // } else {
        //      printBinStrings(n-1, 0, str.append("0"));
        // }

        //BASE CASE
        if(n == 0){
            System.out.println(str);
            return;
        }

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
             printBinStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
      printBinStrings(3,0,"" );
    }
}
