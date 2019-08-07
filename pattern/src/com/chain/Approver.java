/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:27
 */
package com.chain;

/**
 * Approver.java
 * 抽象的处理者，作为具体处理者的一个最终父类
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:27
 */
public abstract class Approver {

    protected Approver successor; // 下一级审批对象
    protected String name; // 审批者名字
    
    public Approver(String name) {
        super();
        this.name = name;
    }
    
    
    // 后继审批对象
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    
    // 子类要实现的方案，真正处理请求
    public abstract void processRequest(PurchaseRequest request);
    
}
