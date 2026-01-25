package com.example.visitorpattern.user;

import com.example.visitorpattern.visitor.Visitor;
import lombok.Data;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 20:02
 * @phone 15524322169
 */

public class Student extends  User{

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }





    @Override
    public void accept(Visitor visitor) {
            visitor.visit( this);
    }



    public int ranking(){
        return (int)(Math.random()*100);
    }
}
