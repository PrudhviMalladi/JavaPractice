public interface Phone {
    void square(int a );
       default void show(int c){
           System.out.println(c+c);
       }
}
