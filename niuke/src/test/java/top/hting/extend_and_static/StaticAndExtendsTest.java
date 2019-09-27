package top.hting.extend_and_static;

/**
 * 继承和静态代码块，代码块执行顺序问题
 */
class P {
    public P(){
        System.out.println("class P");
    }
    {
        System.out.println("block P");
    }

    static {
        System.out.println("static block P");
    }

}

/**
 * java 程序初始化的执行顺序：
 *  父类静态变量->父类静态代码块->子类静态变量->子类静态代码块->
 *  父类非静态变量->父类非静态代码块->父类构造方法
 *  ->子类非静态变量，非静态代码块-> 子类构造方法
 *
 */
public class StaticAndExtendsTest extends P {
    public StaticAndExtendsTest(){
        System.out.println("class StaticAndExtendsTest");
    }
    {
        System.out.println("block StaticAndExtendsTest");
    }

    static {
        System.out.println("static block StaticAndExtendsTest");
    }

    public static void main(String[] args) {
        new StaticAndExtendsTest();
    }
}
