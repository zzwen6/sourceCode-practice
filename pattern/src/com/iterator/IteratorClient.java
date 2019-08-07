/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:12:00
 */
package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * IteratorClient.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:12:00
 */
public class IteratorClient {
    public static void main(String[] args) {
        List products = new ArrayList<>();
        products.add("111");
        products.add("222");
        products.add("333");
        products.add("444");
        products.add("555");
        
        AbsObjectList list = new ProductList(products);
        AbsIterator iterator = list.iterator();
        
        while(iterator.hasNext()){
            
            Object item = iterator.getNextItem();
            iterator.next();
            System.out.println(item.toString());
        }
        
    }
}
