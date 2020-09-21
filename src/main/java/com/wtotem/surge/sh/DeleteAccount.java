package com.wtotem.surge.sh;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class DeleteAccount {



    @Test
    public void AccountDelete() {

        System.setProperty("webdriver.chrome.driver","/home/ake1a/Рабочий стол/RegistrationAutomated/chromedriver"); // путь к драйверу
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--window-size=1920,1080");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("http://wtotem.surge.sh/cabinet/sign-in");

        Utils.sleep(3000);

        driver.findElement(By.name("email")).sendKeys("autotests@bk.ru");
        driver.findElement(By.name("password")).sendKeys("h@rdpasSw0rD");

        Utils.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/form/button")).click();

        Utils.sleep(15000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/button")).click();

        Utils.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div/button")).click();

        Utils.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div/div[2]/div[2]/span")).click();

        Utils.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/div[2]")).click();

        Utils.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div/div/div[5]/div[2]/ul/li[1]/a")).click();

        Utils.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/span")).click();

        Utils.sleep(1500);

        ((JavascriptExecutor)driver).executeScript("window.open('about:blank','-blank')");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://mail.ru/");

        Utils.sleep(5000);

        driver.findElement(By.name("login")).sendKeys("autotests@bk.ru");

        Utils.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"mailbox:submit-button\"]/input")).click();

        Utils.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("h@rdpasSw0rD");

        Utils.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"mailbox:submit-button\"]/input")).click();

        Utils.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/a[1]/div[4]/div")).click();

        Utils.sleep(3000);

        WebElement DeleteCode = driver.findElement(By.xpath("//*[contains(@id,'style')]/div/center/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/div/div"));
        driver.findElement(By.xpath("//*[contains(@id,'style')]/div/center/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/div/div"));
        Actions CopyCode = new Actions(driver);
        CopyCode.moveToElement(DeleteCode).doubleClick().build().perform();

        Utils.sleep(3000);

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.LEFT_CONTROL,"c"));

        Utils.sleep(3000);

        driver.switchTo().window(tabs.get(0));

        Utils.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/div[2]/div/div/form/div[1]/input")).sendKeys(Keys.chord(Keys.LEFT_CONTROL,"v"));

        Utils.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/div[2]/div/div/form/div[2]/button")).click();

        Utils.sleep(3000);

        driver.switchTo().window(tabs.get(1));

        Utils.sleep(1800);

        driver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[1]/div[2]/div[1]/span/div/span/span/span[2]")).click();

        Utils.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/span[1]/div/span/span")).click();

        Utils.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/span[2]/div[1]/span/span")).click();

        Utils.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div[2]/div/div/div[4]/div[1]/span/span/span")).click();

        Utils.sleep(2000);

        driver.quit();

    }

}
