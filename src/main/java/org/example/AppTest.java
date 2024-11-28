package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class AppTest {
    static AppiumDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        openMobileApp();

    }

    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("uuid", "R8OF6TIB7P6LQCIZ");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion", "14.0.8");
        cap.setCapability("automationName","uiAutomator2");
        cap.setCapability("appPackage","com.bachhoaxanh");
        cap.setCapability("appActivity","com.bachhoaxanh.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);
    }
}