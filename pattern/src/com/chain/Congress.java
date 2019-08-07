/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:46:13
 */
package com.chain;

/**
 * Congress.java
 * 董事会类
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:46:13
 */
public class Congress extends Approver{

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会  审批采购单" + ",金额为:" + request.getAmount());
    }

}
