package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox1 {
    WebDriver driver = new FirefoxDriver();

    @Before
    public void setup() throws InterruptedException {

        driver.get("https://courses.ultimateqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


    }


    @Test

    public void checkboxtest() throws InterruptedException {

        WebElement signIn = driver.findElement(By.partialLinkText("Sign In"));
        signIn.click();
        Thread.sleep(2000);


        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        Thread.sleep(2000);

        Assert.assertTrue(checkbox.isSelected());




    }

    @After

    public void teardown(){

        driver.close();
    }

}


