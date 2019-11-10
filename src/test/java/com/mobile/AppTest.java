package com.mobile;

//import com.sun.tools.javac.util.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static AppiumDriver<WebElement> driver;
    public static DesiredCapabilities cap;

    public static void AndroidLaunchApp() throws MalformedURLException, InterruptedException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","Nexus_5X_API_29_x86");
        cap.setCapability("appPackage","io.appium.android.apis");
        cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")).click();
//        Assert.checkNonNull(driver);
    }

    public static void iOSLaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName","iOS");
        cap.setCapability("deviceName","iPhone 11 Pro Max");
        cap.setCapability("platformVersion","13.2");
        cap.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
        driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//        Assert.checkNonNull(driver);
    }

    public static void CloseApp(){
        driver.quit();
    }

}
