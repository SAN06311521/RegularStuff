import java.util.Scanner;

public class SelectionSort {
    public static void select(int[] arr, int n){
        //find the smallest element and swap it
        for(int i = 0; i < n-1; i++){
            int smallest = i; //sbse phle consider the smallest
            for(int j = i+1; j < n; j++){  //i+1 kuki first element ko smallest maana h toh usko chodkar agle wale se compare krenge
                if(arr[smallest] > arr[j]){
                    smallest = j;  //agar smallest bada ho jata h next element se toh swap kr denge
                }
            }
            //start and smallest swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        //selection sort m aage ki array sort hoti chali jayegi
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
        select(arr, n);
        //printing
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
