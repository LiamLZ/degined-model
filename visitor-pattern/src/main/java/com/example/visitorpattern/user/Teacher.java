package com.example.visitorpattern.user;

import com.example.visitorpattern.visitor.Visitor;

import java.math.BigDecimal;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 19:56
 * @phone 15524322169
 */
public class Teacher extends  User{

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }



    @Override
    public void accept(Visitor visitor) {
            visitor.visit(this);
    }

    public double entranceRatio(){
        // 直接使用Math.random()生成0-100之间的值，保留两位小数
        double value = Math.random() * 100;
        // 四舍五入到两位小数
        return Math.round(value * 100.0) / 100.0;
    }
}
