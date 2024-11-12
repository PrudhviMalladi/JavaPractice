
interface FunInterface{
    void fun(int x);
    default void heavyFun(){
        System.out.println("Hello");
    }
}

public class LambdaExpression   {
    public static void main(String[] args) {
        FunInterface fobj = (int x) -> System.out.println(2+x);
        fobj.fun(5);
        fobj.heavyFun();
    }
}
