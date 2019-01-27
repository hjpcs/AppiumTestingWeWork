package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.page.MainPage;
import com.testerhome.hogwarts.wework.api.testcase.AppTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ContactManagePageTest extends AppTestCase {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        String departmentName="demo3";
        String name=MainPage.getInstance()
                .gotoContact()
                .gotoManage().add(departmentName).back()
                .getDepartment(departmentName);
        assertThat(name, equalTo(departmentName));
    }
}