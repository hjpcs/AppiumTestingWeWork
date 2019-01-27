package com.testerhome.hogwarts.wework.api.testcase;

import com.testerhome.hogwarts.wework.api.driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class AppTestCase {
    @BeforeAll
    public static void beforeAllAppTestCase(){
        Driver.getInstance().start();
    }


    @AfterAll
    public static void afterAllAppTestCase(){
        Driver.getInstance().appiumDriver.quit();
    }

}
