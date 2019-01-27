package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.driver.Element;
import com.testerhome.hogwarts.wework.api.page.BasePage;
import com.testerhome.hogwarts.wework.api.page.user.AddUserPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class ContactPage extends BasePage {
    By manage=By.id("e3g");


    Element manage1=new Element( new ArrayList<By>(){{
        add(By.id("e3g"));
        add(By.id("e3g"));
    }}, new ArrayList<By>(){{
        add(By.id("e3g"));
        add(By.id("e3g"));
    }});

    Element manage2=new Element("/element.yaml");





    public ContactManagePage gotoManage(){
        click(manage);
        //manager.find().click();
        return new ContactManagePage();
    }

    public String getDepartment(String name){
        By departmentName= MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().text(\""+ name + "\").instance(0));");
        return attribute(departmentName, "text");
    }

    public DepartmentPage gotoDepartment(String name){
        By departmentName= MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().text(\""+ name + "\").instance(0));");
        find(departmentName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(byText(name));
        return new DepartmentPage();
    }

    public AddUserPage gotoAddUser(){
        gotoDepartment("添加成员");
        return new AddUserPage();
    }

    public AddUserPage gotoA(){
        //loadAction("gotoA")
        return new AddUserPage();
    }
}
