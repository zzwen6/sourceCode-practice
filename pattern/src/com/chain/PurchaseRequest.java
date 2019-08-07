/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:16
 */
package com.chain;

/**
 * PurchaseRequest.java
 * 采购单：请求类
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:16
 */
public class PurchaseRequest {
    
    private double amount; //采购金额 
    private int number; // 采购数
    private String purpose; // 采购目的
    
    
    
    
    public PurchaseRequest(double amount, int number, String purpose) {
        super();
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    
}
