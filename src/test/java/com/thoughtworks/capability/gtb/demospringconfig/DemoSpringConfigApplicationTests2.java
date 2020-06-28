package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test2")
public class DemoSpringConfigApplicationTests2 {
    @Autowired
    private LevelController levelController;

    @Test
    void contextLoads() {
        System.out.println(levelController.getLevel());
        assertEquals("basic", levelController.getLevel());
    }
}