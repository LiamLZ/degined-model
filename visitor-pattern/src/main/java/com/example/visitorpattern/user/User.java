package com.example.visitorpattern.user;

import com.example.visitorpattern.visitor.Visitor;
import lombok.Data;

/**
 * 用户抽象类，实现访问者模式中的被访问元素角色
 * 定义了用户的基本属性和接受访问者访问的方法
 *
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/24 18:10
 * @phone 15524322169
 */
@Data
public abstract class User {
    private String name;

    private String identity;

    private String clazz;

    /**
     * 构造函数，初始化用户对象
     *
     * @param name 用户姓名
     * @param identity 用户身份
     * @param clazz 用户班级
     */
    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    /**
     * 接受访问者访问的抽象方法
     * 子类需要实现具体的访问逻辑
     *
     * @param visitor 访问者对象，用于对用户进行操作
     */
    public abstract  void  accept(Visitor  visitor);




}