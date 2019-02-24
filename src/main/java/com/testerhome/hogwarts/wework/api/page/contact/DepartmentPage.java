package com.testerhome.hogwarts.wework.api.page.contact;

import com.testerhome.hogwarts.wework.api.driver.Driver;
import com.testerhome.hogwarts.wework.api.page.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DepartmentPage extends BasePage {

    //进入管理页面
    By manage=By.id("e3g");
    public ContactManagePage gotoManage(){
        System.out.println(Driver.getInstance().appiumDriver.getPageSource());
        click(manage);
        return new ContactManagePage();
    }

    //进入部门页面
    public DepartmentPage gotoDepartment(String name){
        By departmentName= MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().text(\""+ name + "\").instance(0));");

        find(departmentName);
        click(byText(name));
        return new DepartmentPage();
    }

    //获得所有子部门文本
    public List<String> getSubDepartmentNames(){
        List<String> array=new ArrayList<>();
        for(WebElement element : findElements (By.xpath("//*[contains(@resource-id, 'akg')]/android.widget.TextView"))){
            array.add(element.getText());
        }
        return array;
    }

    //删除所有子部门
    public ContactManagePage deleteAll(){
        while(findElements(byText("部门无成员")).size()==0){
            if(getSubDepartmentNames().size()==0){
                break;
            }else {
                String sub = getSubDepartmentNames().get(0);
                gotoDepartment(sub).gotoManage().delete();
            }
        }
        return new ContactManagePage();
    }
}
