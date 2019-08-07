/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:34:13
 */
package com.chain;

/**
 * ChainClient.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午3:34:13
 */
public class ChainClient {
    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;// = new Director("孙悟空");
        director = new Director("孙悟空");
        vicePresident = new VicePresident("唐僧");
        president = new President("观音");
        congress = new Congress("天庭");
        
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);
        
        PurchaseRequest request1 = new PurchaseRequest(100, 2, "买东海龙王的金箍棒");
        director.processRequest(request1);
        
        PurchaseRequest request2 = new PurchaseRequest(60000, 2, "买玉瓶");
        director.processRequest(request2);
        
        
        PurchaseRequest request3 = new PurchaseRequest(200000, 2, "买蟠桃");
        director.processRequest(request3);
        
        
        PurchaseRequest request4 = new PurchaseRequest(4000000, 2, "去除紧箍咒");
        director.processRequest(request4);
    }
}
