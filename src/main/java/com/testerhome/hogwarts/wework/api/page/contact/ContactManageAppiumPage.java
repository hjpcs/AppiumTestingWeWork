package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.driver.Driver;
import com.testerhome.hogwarts.wework.api.page.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ContactManageAppiumPage extends BasePage {
    By 添加子部门=byText("添加子部门");

    //PO注解，可以适配多个平台
    @FindBy(xpath = "xxxxxxx")
    @AndroidBy(xpath = "")
    @iOSFindBy(xpath = "")
    WebElement 添加子部门2;


    By 添加成员=byText("添加成员");
    By 关闭=By.id("e3j");
    By 编辑框=By.id("b9k");

    //在这里对注解的操作进行初始化
    public ContactManageAppiumPage(){
        PageFactory.initElements(
                new AppiumFieldDecorator(Driver.getInstance().appiumDriver, Duration.ofSeconds(15)),
                this //an instance of PageObject.class
        );
        添加子部门2.click();
    }


    public ContactManageAppiumPage add(String name){
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
