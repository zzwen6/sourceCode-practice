/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:52:51
 */
package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * AbsObjectList.java
 * 抽象聚合类
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:52:51
 */
public abstract class AbsObjectList {
    
    protected List<Object> objects = new ArrayList<>();
    
    
    public AbsObjectList(List<Object> objects) {
        super();
        this.objects = objects;
    }

    public void addObject(Object o){
        objects.add(o);
    }
    
    public void removeObject(Object o){
        objects.remove(o);
    }
    
    public List<Object> getObjects(){
        return objects;
    }
    
    
    public abstract AbsIterator iterator();
}
