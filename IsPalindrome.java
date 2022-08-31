public class IsPalindrome {
    public String palindrome(int n){
        String ans = "";
        int reverse = 0;
        int num = n;
        while(num != 0){
            int rem = num%10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if(reverse == n){
            ans = "Yes";
        }else{
            ans = "No";
        }
        return ans;
    }
}
