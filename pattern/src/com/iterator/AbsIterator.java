/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:54:28
 */
package com.iterator;

/**
 * AbsIterator.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:54:28
 */
public interface AbsIterator {

    void next();
    void previous();
    
    boolean hasNext();
    
    boolean isLast();
    boolean isFirst();
    
    Object getNextItem();
    Object getPreItem();
}
