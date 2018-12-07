package com.automation.gvc.setup;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.AnalysisStrategy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static com.automation.gvc.setup.ExtentManager.test;
import static com.automation.gvc.setup.ExtentManager.extent;

public class BasicSetup {

    public WebDriver driver;
    static Logger LOG = LoggerFactory.getLogger(BasicSetup.class);

    public void takeScreenshot(WebDriver driver, String name) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("/../Screenshots/Actual/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Parameters({"browser"})
    @BeforeSuite
    public void setup(String browser) throws MalformedURLException {

        String pathChrome = System.getProperty("user.dir") + "/../src/main/resources/chromedriver.exe";
        String pathFirefox = System.getProperty("user.dir") + "/../src/main/resources/geckodriver.exe";

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", pathChrome);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("test-type");
            driver = new ChromeDriver();
            LOG.info("| Chrome browser launched successfully |");


        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", pathFirefox);
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAcceptUntrustedCertificates(true);
            profile.setAssumeUntrustedCertificateIssuer(true);
            driver = new FirefoxDriver();
            LOG.info("| Firefox browser launched successfully |");
        }
    }


    @AfterMethod
    public void report(ITestResult result) throws Exception {

        String testName = result.getName();
        String pathFail = System.getProperty("user.dir") + "/../Screenshots/Failed/";
        String pathPass = System.getProperty("user.dir") + "/../Screenshots/Passed/";
        String name = result.getName();
        File filePass;
        File fileFail;

        switch (result.getStatus()) {

            case ITestResult.SUCCESS:
                System.out.println("PASSED: " + testName);
                test.pass("| PASSED |" + name);
                filePass = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(filePass, new File(pathPass + name + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case ITestResult.FAILURE:
                Throwable throwable = result.getThrowable();
                if (throwable != null)
                    test.fail(MarkupHelper.createLabel("[FAILED] Test failed on method: " + result.getName(), ExtentColor.RED));
                fileFail = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(fileFail, new File(pathFail + name + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    test.fail("Failed on screen:", MediaEntityBuilder.createScreenCaptureFromPath(pathFail + testName + ".png").build());
                    test.fail(result.getThrowable());
                break;

            case ITestResult.SKIP:
                test.skip(MarkupHelper.createLabel("[SKIPPED]: " + testName, ExtentColor.ORANGE));
                break;

            default:
                String msg = "Unexpected test status: " + result.getStatus();
                test.error(msg);
                System.out.println("ERROR:" + msg);
                throw new RuntimeException(msg);
        }
    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        extent.flush();
    }

    @AfterSuite(alwaysRun = true)
    public void finish() {
        driver.quit();
    }
}
