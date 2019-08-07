/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:00:48
 */
package com.iterator;

import java.util.List;

/**
 * ProductList.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:00:48
 */
public class ProductList extends AbsObjectList{

    
    
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbsIterator iterator() {
        
        return new ProductIterator(this);
    }

}
