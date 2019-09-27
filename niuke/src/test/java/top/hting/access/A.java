package top.hting.access;

import top.hting.access.inner.B;

/**
 * 演示 public default protected private 的访问权限问题
 */
public class A extends B{

    public void testA() {
        testB();

    }

}
