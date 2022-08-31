public class SumOfAllDivisorsFrom1ToN {
    public static long sumOfDivisors(int N){
        // code here
        long ans = 0;
        for(int i = 1; i <= N; i++){
            ans += (N/i)*i;
        }
        return ans;
    }
}
