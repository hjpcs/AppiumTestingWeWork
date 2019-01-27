package com.testerhome.hogwarts.wework.api.page;

import com.testerhome.hogwarts.wework.api.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    public WebElement find(By by){
        //todo: 弹框处理
        WebElement element=null;
        try{
            element=Driver.getInstance().find(by);
        }catch(Exception e){
            //todo: getPageSource + xpath
            //弹框xpath列表
        }
        return element;
    }

    public void click(By by){
        find(by).click();
    }
    public void click(String text){
        find(byText(text)).click();
    }
    public void sendKeys(String content){
        Driver.getInstance().appiumDriver.getKeyboard().sendKeys(content);
    }
    public void sendKeys(By by, String content){
        find(by).sendKeys(content);
    }

    public By byText(String text){
        //fix: 特殊字符处理
        return By.xpath("//*[@text='"+text + "']");
    }

    public String attribute(By by, String name){
        return find(by).getAttribute(name);
    }

    public List<WebElement> findElements(By by){
        return Driver.getInstance().appiumDriver.findElements(by);
    }
}
