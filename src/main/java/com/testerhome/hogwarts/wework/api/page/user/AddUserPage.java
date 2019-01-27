package com.testerhome.hogwarts.wework.api.page.user;

import com.testerhome.hogwarts.wework.api.page.BasePage;
import org.openqa.selenium.By;

public class AddUserPage extends BasePage {
    By 手动输入添加=byText("手动输入添加");
    By name=By.xpath("//*[@class='android.widget.EditText' and @instance=0]");
    By phone=By.xpath("//*[@class='android.widget.EditText' and @instance=1]");
    By save=byText("保存");
    By 设置部门=byText("设置部门");

    public void input(String name, String phone){
        click(手动输入添加);
        sendKeys(this.name, "demoName");
        sendKeys(this.phone, phone);
        click(设置部门);
        click(byText("确定(1)"));
        click(save);
    }




}
