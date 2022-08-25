import java.util.*;

public class BubbleSort {
    public static void bubble(int[] arr, int n){
        //n-1 because we have n-1 elements, as last element will be automatically sorted
        for(int i = 0; i < n-1; i++){
            //n-i-1 because (n-1) toh initially tha hi, minus i aur kara because i elements har baar sort hote chale jayenge jese first loop m i = 0, toh 0 element sorted, then i = 1 toh 1 element sorted h usko nahi lena
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //bubble sort m picche se aray sort hoti chali jati h
    }

    public static void main(String[] args) {
        //taking input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        //sorting
        bubble(arr, n);
        //printing
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
