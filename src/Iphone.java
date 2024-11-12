public class Iphone implements Phone{

    public void square(int a) {
        System.out.println(a*a);

    }

    public static void main(String[] args) {
        Iphone apple =new Iphone();
        apple.square(4);
        apple.show(5);

    }
}
