package com.testerhome.hogwarts.wework.api.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public AppiumDriver appiumDriver;

    static Driver driver;
    public static Driver getInstance(){
        if(driver==null){
            driver=new Driver();
        }
        return driver;
    }
    public void start(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "ddd");
        desiredCapabilities.setCapability("appPackage", "com.tencent.wework");
        desiredCapabilities.setCapability("appActivity", ".launch.LaunchSplashActivity");
        desiredCapabilities.setCapability("noReset", "true");
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);
        desiredCapabilities.setCapability("printPageSourceOnFindFailure", true);

        try {
            appiumDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public WebElement find(By by){
        return appiumDriver.findElement(by);
    }
}
