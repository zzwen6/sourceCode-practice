/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:59
 */
package com.chain;

/**
 * VicePresident.java
 * 副董事长类
 * 100000 十万
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:45:59
 */
public class VicePresident extends Approver{
    
    private static final Double ONE_HUNDRED_THOUSAND = 100000.00;
    
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ONE_HUNDRED_THOUSAND) {
            System.out.println("副董事长 "+this.name +"审批采购单" + ",金额为:" + request.getAmount());
        }else{
            // 向下级抛出
            this.successor.processRequest(request);
        }
    }

}
