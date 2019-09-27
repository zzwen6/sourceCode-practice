package top.hting;

public class StaticTest {

    static  {
        int x = 5;
    }

    static  int x,y;

    public static void main(String[] args) {
        x --;
        myMethod();
        System.out.println(x+y+ ++x);
    }

    private static void myMethod() {
        y = x++ + ++x;

    }

}
