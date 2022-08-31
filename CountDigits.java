public class CountDigits {

    public static int countFunc(int N){
        int count = 0;
        int num = N;
        while(num != 0){
            int rem = num%10;
            if(rem != 0 && N%rem == 0){
                count++;
            }
            num = num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        countFunc(n);
    }
}
