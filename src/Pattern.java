public class Pattern {

    public static void main(String[] args) {
        pattern(10);
    }
    public static void pattern(int output){
        int n=10;
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n-i-1; j++) {
                System.out.print("0 ");

            }
            System.out.println(n-i);

        }

    }
}
