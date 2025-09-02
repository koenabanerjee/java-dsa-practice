package Recursion;

public class LastOccurence {
     public static int lastOccur(int arr[], int key, int i){
        if(i == arr.length){ // Base case: reached end of array
            return -1;
        }

        // Recursive call: check in the rest of the array
       int isFound = lastOccur(arr, key, i+1);

       // If not found in later part, but arr[i] matches key, return current index
       if(isFound == -1 && arr[i] == key){
        return i;
       }

       

       return isFound; // Else return whatever was found deeper
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.err.println(lastOccur(arr, 5, 0));
    }
    
}
