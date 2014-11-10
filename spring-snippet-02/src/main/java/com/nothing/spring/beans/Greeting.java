package com.nothing.spring.beans;

/**
 * @author chenliu, create at 11/10/14 22:57
 */
public class Greeting {
    private String name;
    public String greet(){
        return "Hello,"+name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
