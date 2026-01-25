package com.example.visitorpattern.visitor;

import com.example.visitorpattern.user.Student;
import com.example.visitorpattern.user.Teacher;
import com.example.visitorpattern.user.User;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 19:54
 * @phone 15524322169
 */
public  interface Visitor {

     void visit(Student user);
     void visit(Teacher user);

}
