/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:28:26
 */
package com.command;

/**
 * WindowCommand.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:28:26
 */
public class WindowCommand implements Command{
    private WindowHanlder hanlder;

    public WindowCommand() {
        hanlder = new WindowHanlder();
    }
    
    @Override
    public void execute() {
        
        hanlder.minimsize();
    }
    
    
}
