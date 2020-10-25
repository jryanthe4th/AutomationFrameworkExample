package com.buildselenium;


import com.buildselenium.config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HelloSeleniumTest {

    public static void main(String[] args) {

        System.out.println("Hello Selenium!");
        Config.whatIsMyOperatingSystem();



        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("buildselenium.com" + Keys.ENTER);
        driver.quit();

    }
}
