package com.homes.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tester")
public class Test{
    @Id
    @Column(name="id")
    private int id;

    @Column(name = "str")
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    private String name;

    public Test(){}

    public Test(String  str, String name,int num){
        this.name=name;
        this.str=str;
        this.id=num;
    }
}
