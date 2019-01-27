package com.testerhome.hogwarts.wework.api.page.user;

import com.testerhome.hogwarts.wework.api.page.MainPage;
import com.testerhome.hogwarts.wework.api.testcase.AppTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddUserPageTest extends AppTestCase {

    @BeforeEach
    void setUp() {
    }

    @Test
    void input() {
        MainPage.getInstance().gotoContact().gotoAddUser().input("demo", "15600534760");
    }
}