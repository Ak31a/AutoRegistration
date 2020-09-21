package com.wtotem.surge.sh;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoToLinkInEmail {

    @Test
    public void GoToEmail()  {

        System.setProperty("webdriver.chrome.driver", "/home/ake1a/Рабочий стол/RegistrationAutomated/chromedriver"); // путь к драйверу
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--window-size=1920,1080");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://mail.ru/");

        Utils.sleep(1000);

        driver.findElement(By.name("login")).sendKeys("autotests@bk.ru");

        Utils.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"mailbox:submit-button\"]/input")).click();

        Utils.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("h@rdpasSw0rD");

        Utils.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"mailbox:submit-button\"]/input")).click();

        Utils.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/a[1]/div[4]/div")).click();

        Utils.sleep(5000);

        driver.findElement(By.linkText("Click here")).click();

        Utils.sleep(15000);

        driver.quit();

    }

}
