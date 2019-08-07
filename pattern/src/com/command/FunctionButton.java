/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:20:59
 */
package com.command;

/**
 * FunctionButton.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:20:59
 */
public class FunctionButton {
    private String name;
    private Command command;
    public FunctionButton(String name) {
        super();
        this.name = name;
    }
     
    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void onClick() {
        System.out.println("按键被触发");
        command.execute();
    }
}
