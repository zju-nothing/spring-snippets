package com.nothing.user.dataobject;

/**
 * @author chenliu, create at 11/24/14 21:17
 */
public class User {
    private long id;
    private String name;
    private int age;

    //Need to be provide when you override the default construct func.
    //This default construct will be used when ibatis apply a result map to the User instance.
    public User(){}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
