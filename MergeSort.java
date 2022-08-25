import java.util.Scanner;

public class MergeSort {

    //tc - o(nlogn) , requires extra memory

    public static void conquer(int[] arr, int si, int mid, int ei){  //o(n)
        //ek nayi array banayenge merged jisme sort krenge fir original m copy krenge
        int[] merge = new int[ei - si + 1]; //pura ending se start tak ka size, +1 isilye kra h kuki zero based indexing h
        int idx1 = si; //to track first array
        int idx2 = mid+1; //to track second array
        int x = 0; //to track the index of merge array
        while(idx1 <= mid && idx2 <= ei){ //tab tak apn ko sort krna h array ko
            if(arr[idx1] <= arr[idx2]){
                merge[x] = arr[idx1];
                x++;
                idx1++;
            }
            else{
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        //ab agar ek koise bhi array m element bach gye toh unko as it is daalne k liye ye dono while loop h
        //in dono m se ek hi while loop chalega
        while(idx1 <= mid){
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }
        while(idx2 <= ei){
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }
        //ab original array m merge array k element ko copy krna h
        for(int i = 0, j = si; i < merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }

    public static void divide(int[] arr, int si, int ei){ //o(logn)
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
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
        divide(arr, 0, n-1); //dhyan rkhna end should be n-1 not n
        //printing
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
