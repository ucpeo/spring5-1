package com.ucpeo.spring5.bean;

public class User {
    String name ;
    String psw ;

    public User(){
        System.out.println("这是User的构造方法,说明一个User类被实例化");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
