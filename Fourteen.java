public class Fourteen {
    public static void main(String[] args) {
        char start = 'A' - 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                char ch = (char) (start + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
