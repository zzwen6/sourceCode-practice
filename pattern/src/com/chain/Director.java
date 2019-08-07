/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:49
 */
package com.chain;

/**
 * Director.java
 * 具体处理者，主任级别
 * 50000以下可批
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:49
 */
public class Director extends Approver{
    
    public static final Double FIFITY_THROUSAND = 50000.00;
    
    public Director(String name){
        super(name);
    }
    
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < FIFITY_THROUSAND) {
            System.out.println("主任 "+this.name +"审批采购单" + ",金额为:" + request.getAmount());
        }else{
            // 向下级抛出
            this.successor.processRequest(request);
        }
        
    }

}
