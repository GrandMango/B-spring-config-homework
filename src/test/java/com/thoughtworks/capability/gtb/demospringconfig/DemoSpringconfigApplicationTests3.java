package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest( properties = {"levelNumber=1"})
@SpringBootTest()
@TestPropertySource( properties = {"levelNumber=1"})
public class DemoSpringconfigApplicationTests3 {
    @Autowired
    private LevelController levelController;

    @Test
    void contextLoads() {
        System.out.println(levelController.getLevel());
        assertEquals("advanced", levelController.getLevel());
    }
}
