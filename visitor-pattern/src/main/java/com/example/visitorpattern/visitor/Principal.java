package com.example.visitorpattern.visitor;

import com.example.visitorpattern.user.Student;
import com.example.visitorpattern.user.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/25 20:04
 * @phone 15524322169
 */
public class Principal implements Visitor{
    private Logger logger = LoggerFactory.getLogger(Principal.class);


    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}",student.getName(),student.getClazz());
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 升学率：{}",teacher.getName(),teacher.getClazz(),teacher.entranceRatio());
    }
}
