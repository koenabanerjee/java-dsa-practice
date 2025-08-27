package Sorting;

public class bubbleSort {

    public static void bubble_sort(int arr[]){
        
        for(int turn = 0;turn<arr.length-1;turn ++){
            int flag = 0;
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag++;
                }
                
            }
            if(flag == 0){
                    break;
                }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubble_sort(arr);
        printArr(arr);
    }
    
}
