package com.wtotem.surge.sh;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.wtotem.surge.sh.Utils.sleep;


public class AutoRegistration {

    @Test
    public static void fillingOutAForm() {

        System.setProperty("webdriver.chrome.driver","/home/ake1a/Рабочий стол/RegistrationAutomated/chromedriver"); // путь к драйверу
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--window-size=1920,1080");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("http://wtotem.surge.sh/pricing");

        String title = driver.getTitle(); // объявил тайтл в качестве переменной
        Assert.assertTrue(title.equals("Pricing for your Security - Webtotem"));

        sleep(1000);

        driver.findElementByXPath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div/div[1]/main/div/section[1]/div/div[4]/div[1]/div/div[3]/button").click();

        sleep(3000);

        driver.findElement(By.name("name")).sendKeys("Tester");

        sleep(3000);

        driver.findElement(By.name("email")).sendKeys("autotests@bk.ru");

        sleep(3000);

        driver.findElement(By.name("password")).sendKeys("h@rdpasSw0rD");

        sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[4]/button")).click();

        sleep(3000);

        driver.findElement(By.name("site")).sendKeys("kcybs.com");

        sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/button")).click();

        sleep(7000);

        driver.quit();


    }


}
