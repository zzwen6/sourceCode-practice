/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:23:25
 */
package com.command;

/**
 * HelpCommand.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:23:25
 */
public class HelpCommand implements Command{

    private HelpHandler handler;
    
    public HelpCommand() {
        this.handler = new HelpHandler();
    }


    @Override
    public void execute() {
         handler.display();
        
    }

}
