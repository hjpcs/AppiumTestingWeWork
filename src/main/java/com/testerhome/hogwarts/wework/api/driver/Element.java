package com.testerhome.hogwarts.wework.api.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Element {
    public List<By> android;
    public List<By> ios;
    public List<By> h5;

    public Element(List<By> android, List<By> ios){
        this.android=android;
        this.ios=ios;
    }

    public Element(String path){
        //load(path)
    }

    public WebElement find(){
        WebElement element=null;
        if(Driver.getInstance().getPlatform().equals("android")) {
            for(By locator : android) {
                try {
                    element=Driver.getInstance().appiumDriver.findElement(locator);
                    break;
                }catch (Exception e){

                }
            }
        }else if(Driver.getInstance().getPlatform().equals("ios")){
            for(By locator : ios) {
                try {
                    element=Driver.getInstance().appiumDriver.findElement(locator);
                    break;
                }catch (Exception e){

                }
            }

            for(By locator : android) {
                try {
                    element=Driver.getInstance().appiumDriver.findElement(locator);
                    break;
                }catch (Exception e){

                }
            }


        }
        return element;
    }

}
