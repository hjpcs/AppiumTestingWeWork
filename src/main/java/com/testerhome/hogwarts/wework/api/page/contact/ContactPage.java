package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.page.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ContactPage extends BasePage {
    By manage=By.id("e3g");

    public ContactManagePage gotoManage(){
        click(manage);
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
        click(departmentName);
        return new DepartmentPage();
    }
}
