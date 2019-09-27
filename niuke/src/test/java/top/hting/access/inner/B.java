package top.hting.access.inner;

public class B {
    // 1.子类可以直接访问
    // 2.同一包非子类，可以new B 之后通过对象访问
    protected void testB(){}

    // 1.在同一包下 new B之后，通过对象访问
    void testB1(){}


}
