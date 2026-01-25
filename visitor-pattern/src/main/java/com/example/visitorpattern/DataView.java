package com.example.visitorpattern;

import com.example.visitorpattern.user.Student;
import com.example.visitorpattern.user.Teacher;
import com.example.visitorpattern.user.User;
import com.example.visitorpattern.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 20:10
 * @phone 15524322169
 */
public class DataView {

    List<User> userList = new LinkedList<>();


    public DataView() {
        userList.add(new Student("小王", "重点班", "一年一班"));
        userList.add(new Student("小张", "重点班", "一年二班"));
        userList.add(new Student("小李", "普通班", "一年三班"));
        userList.add(new Student("小赵", "重点班", "一年四班"));
        userList.add(new Student("小孙", "普通班", "一年五班"));
        userList.add(new Teacher("周老师", "特级教师", "一年一班"));
        userList.add(new Teacher("王老师", "特级教师", "一年二班"));
        userList.add(new Teacher("李老师", "特级教师", "一年三班"));
        userList.add(new Teacher("赵老师", "特级教师", "一年四班"));
        userList.add(new Teacher("孙老师", "普通教师", "一年五班"));


    }

    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
