package com.automation.gvc.test;

import com.automation.gvc.setup.BasicSetup;
import com.automation.gvc.setup.ExtentManager;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import static com.automation.gvc.setup.ExtentManager.test;
import static com.automation.gvc.setup.ExtentManager.extent;

import static com.automation.gvc.PageObjects.HomePage.btn_LogIn;

public class TC_001_Login extends BasicSetup {

    private String baseUrl = "http://qa1.sports.bwin.com/en/sports";
    protected static Logger LOG = LoggerFactory.getLogger(TC_001_Login.class);


    @BeforeClass
    public void startTest() {
        extent = ExtentManager.GetExtent();
        test = extent.createTest("[TC_001] User log in", "The purpose of this test is to verify that the user can log in successfully.");
        test.assignAuthor("Pavel Popov");
        test.assignCategory("Login");
        extent.setAnalysisStrategy(AnalysisStrategy.TEST);
    }

    @Test
    public void openHomePage() {
        driver.get(baseUrl);
        System.out.println("Chrome browser has been launched successfully");
        driver.manage().window().maximize();
        System.out.println("Browser has been maximized successfully");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, baseUrl);
        System.out.println("Expected URL address has been opened successfully");
    }


    @Test
    public void openLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.class(btn_LogIn));
        driver.findElement(By.class(btn_LogIn));
    }
}


