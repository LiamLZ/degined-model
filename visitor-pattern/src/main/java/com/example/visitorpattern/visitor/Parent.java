package com.example.visitorpattern.visitor;

import com.example.visitorpattern.user.Student;
import com.example.visitorpattern.user.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 20:04
 * @phone 15524322169
 */
public class Parent implements Visitor{
    private Logger logger = LoggerFactory.getLogger(Parent.class);


    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}",student.getName(),student.getClazz(),student.ranking());
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}",teacher.getName(),teacher.getClazz(),teacher.getIdentity());
    }
}
