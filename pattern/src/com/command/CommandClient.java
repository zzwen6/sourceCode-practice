/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:34:17
 */
package com.command;

/**
 * CommandClient.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:34:17
 */
public class CommandClient {
    public static void main(String[] args) {
        FBSettingWindow settingWindow = new FBSettingWindow("功能键设置");
        FunctionButton b1,b2;
        b1 = new FunctionButton("功能键一");

        b2 = new FunctionButton("功能键二");
        Command c1,c2;
        
        c1 = new HelpCommand();
        c2 = new WindowCommand();
        
        b1.setCommand(c1);
        b2.setCommand(c2);
        
        settingWindow.addButton(b1);
        settingWindow.addButton(b2);
        
        settingWindow.display();
        
        b1.onClick();
        b2.onClick();
        
        
    }
}
