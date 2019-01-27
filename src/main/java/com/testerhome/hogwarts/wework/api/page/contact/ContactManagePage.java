package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.page.BasePage;
import org.openqa.selenium.By;

public class ContactManagePage extends BasePage {
    By 添加子部门=byText("添加子部门");
    By 添加成员=byText("添加成员");
    By 关闭=By.id("e3j");
    By 编辑框=By.id("b9k");

    public ContactManagePage add(String name){
        click(添加子部门);
        sendKeys(编辑框, name);
        click("确定");
        return  this;
    }

    public ContactPage back(){
        click(关闭);
        return new ContactPage();
    }

}
