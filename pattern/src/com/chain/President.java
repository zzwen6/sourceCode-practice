/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:46:05
 */
package com.chain;

/**
 * President.java
 * 董事长类 500000
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:46:05
 */
public class President extends Approver{

    private static final Double FIVE_HUNDRED_THOUSAND = 500000.00;

    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < FIVE_HUNDRED_THOUSAND) {
            System.out.println("董事长 "+this.name +"审批采购单" + ",金额为:" + request.getAmount());
        }else{
            // 向下级抛出
            this.successor.processRequest(request);
        }
    }

}
