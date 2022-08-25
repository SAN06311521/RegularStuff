import java.util.Scanner;

public class QuickSort {

    //tc of quick sort
    //worst case - o(n^2) kb hota h? jab pivot smallest ya largest element ho and arr ya toh asc ho ya desc
    //avg case - o(nlogn)
    // worst tc quick sort ki zada hoti h fir bhi usse use krte h kuki isme extra space nai lgti
    // toh jaha hamare pass space agar h aur worst tc bhi nlogn chahiye toh merge sort use kro vrna
    // jaha space nai h quick sort use kro, mostly quick sort hi use hota h kuki azdatar avg tc hi aati h.


    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //pivot last element ko banana h initially
        int i = low-1; //to track the space mtlb aage khali space banane k liye
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;   //kuki agar chota h toh ek space banao
                //ab swap krenge i par jo element h usko aur jo j par element h usko, ku? kuki i par laana h apn ko j ka element kuki j ka element chota h i pr jo h usse
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //ab pivot ko sahi jagah laana h uske liye phle i++ krk ek space banyenge fir swap krenge high wale element ko i wale element se
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; //kuki i par apna pivot h
    }

    public static void quick(int[] arr, int low, int high){
        //if condition kuki low > high hoga toh implement nai kr skte
        if(low < high){
            int pivotIndex = partition(arr, low, high); //ye main function h jo pivot ki value dega aur pivot k phle usse chote element and baad m usse bade element sort krk dega
            quick(arr, low, pivotIndex - 1);
            quick(arr, pivotIndex + 1, high);
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
        quick(arr, 0, n-1);
        //printing
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
