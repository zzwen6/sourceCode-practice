/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:01:51
 */
package com.iterator;

import java.util.List;

/**
 * ProductIterator.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午5:01:51
 */
public class ProductIterator implements AbsIterator{
    private ProductList productList;
    
    private List list;
    private int c1;
    private int c2;
    
    public ProductIterator(ProductList productList) {
        super();
        this.productList = productList;
        this.list = productList.getObjects();
        this.c1 = 0;
        this.c2 = this.list.size() - 1;
    }

    @Override
    public void next() {
        if (c1 < list.size()) {
            c1++;
        }
    }

    @Override
    public void previous() {
        if (c2 > -1) {
            c2 --;
        }
    }

    @Override
    public boolean hasNext() {
        return c1 < list.size();
    }

    @Override
    public boolean isLast() {
        return c1 == list.size();
    }

    @Override
    public boolean isFirst() {
        return c2 == -1;
    }

    @Override
    public Object getNextItem() {
        return list.get(c1);
    }
    @Override
    public Object getPreItem() {
        return list.get(c2);
    }

}
