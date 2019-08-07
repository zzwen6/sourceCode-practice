/**
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:30:16
 */
package com.command;

import java.util.ArrayList;
import java.util.List;

/**
 * FBSettingWindow.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2017年2月26日下午4:30:16
 */
public class FBSettingWindow {
    private String title;
    
    private List<FunctionButton> buttons = new ArrayList<>();

    public FBSettingWindow(String title) {
        super();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void addButton(FunctionButton button) {
        buttons.add(button);
    }
    
    public void removeButton(FunctionButton button) {
        buttons.remove(button);
    }
    
    
    public void display() {
        System.out.println("显示窗口");
        System.out.println("功能键有如下这些:");
        for (FunctionButton button : buttons) {
            System.out.println(button.getName());
        }
        System.out.println("-------");
    }
    
}
