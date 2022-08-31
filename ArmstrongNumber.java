public class ArmstrongNumber {
    static String armstrongNumber(int n) {
        // code here
        String ans = "";
        int number = n;
        int num = n;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        int check = 0;
        while (number != 0) {
            int digit = number % 10;
            check += Math.pow(digit, count);
            number = number / 10;
        }
        if (check == n) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        return ans;
    }
}
