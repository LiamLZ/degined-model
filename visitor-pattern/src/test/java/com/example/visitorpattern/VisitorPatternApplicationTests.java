package com.example.visitorpattern;

import com.example.visitorpattern.visitor.Parent;
import com.example.visitorpattern.visitor.Principal;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

class VisitorPatternApplicationTests {
    Logger logger = LoggerFactory.getLogger(VisitorPatternApplication.class);

    @Test
    void contextLoads() {

        DataView dataView = new DataView();


        logger.info("------------校长视角-------------------------");
        dataView.show(new Principal());
        logger.info("------------家长视角-------------------------");
        dataView.show(new Parent());

    }

}
