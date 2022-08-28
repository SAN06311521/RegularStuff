public class Sixteen {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                char ch = (char) (i + 64);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
