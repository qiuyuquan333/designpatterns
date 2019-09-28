package com.qyq.designpatterns;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternsApplicationTests {

    @Test
    public void contextLoads() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time/1000);
    }

}
