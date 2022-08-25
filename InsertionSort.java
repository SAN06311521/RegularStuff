import java.util.*;

public class InsertionSort {
    public static void insert(int[] arr, int n){
        //i = 1 kuki phle element ko sorted array maana h
        for(int i = 1; i < n; i++){
            int cur = arr[i];
            int j = i-1; //j is used to keep track over unsorted element
            while(j >= 0 && cur < arr[j]){ //jab tak j bada h zero se (to avoid error) and cur chota h j wale element se
                arr[j+1] = arr[j];  //jagah banayenge aage sorted array m
                j--;
            }
            //jese hi condition dis satisfy hui, uss element ko place kr denge
            arr[j+1] = cur;
        }
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
        insert(arr, n);
        //printing
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
