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

public class TC_001_Login extends BasicSetup {

    private String baseUrl = "http:/qa1.sports.bwin.com";
    protected static Logger LOG = LoggerFactory.getLogger(TC_001_Login.class);
    public String articleName;


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
    public void searchItem() {
        String expectedSearchResult = "Harry Potter";

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));

        WebElement searchTextField = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextField.sendKeys(expectedSearchResult);
        searchTextField.submit();

        String actualSearchResult = driver.findElement(By.id("twotabsearchtextbox")).getText();

        if (actualSearchResult.contentEquals(expectedSearchResult)) {
            System.out.println("Search for item has been completed successfully");
        } else {
            System.out.println("WARNING ! The string in 'Search Text' field is:" + actualSearchResult);
        }
    }

    @Test
    public void openDepartments() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[3]/div[2]/ul[1]/div/li[6]/span/a/span")));

        WebElement list = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[3]/div[2]/ul[1]/div/li[6]/span/a/span"));
        list.click();
        Thread.sleep(500);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 400)", "");

        WebElement departmentToysAndGames = driver.findElement(By.cssSelector("div.a-expander-content:nth-child(6) > li:nth-child(5) > span:nth-child(1) > a:nth-child(1) > h4:nth-child(1)"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.a-expander-content:nth-child(6) > li:nth-child(5) > span:nth-child(1) > a:nth-child(1) > h4:nth-child(1)")));
        departmentToysAndGames.click();
        System.out.println("Department category has been opened successfully");
    }

    @Test
    public void setPriceRange() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,600)", "");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("low-price")));

        WebElement minPriceField = driver.findElement(By.id("low-price"));
        minPriceField.sendKeys("10");

        WebElement maxPriceField = driver.findElement(By.id("high-price"));
        maxPriceField.sendKeys("150");
        maxPriceField.submit();
        System.out.println("Price range has been applied successfully");
    }

    @Test
    public void setAgeRange() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,600)", "");

        WebElement checkbox14YearsAndUp = driver.findElement(By.name("s-ref-checkbox-5442388011"));
        checkbox14YearsAndUp.click();
        System.out.println("Age range has been setted to 14 Years & Up");
    }

    @Test
    public void openItem() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(1500);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Harry Potter Wand']")));
            WebElement article = driver.findElement(By.xpath("//*[text()='Harry Potter Wand']"));
            articleName = article.getText();
            System.out.println("Article name is: " + articleName);
            article.click();
            System.out.println("Item details screen has been opened successfully");

        } catch (StaleElementReferenceException e) {
            System.out.println("Article cannot be found");
        }
    }

    @Test
    public void setQty() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("quantity")));

        Select qty = new Select(driver.findElement(By.id("quantity")));
        qty.selectByIndex(2);
        System.out.println("Quantity changed successfully");
    }

    @Test
    public void addItemToCart() {
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
        System.out.println("Item has been added to cart successfully");
    }

    @Test
    public void checkCart() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hlb-view-cart-announce")));

        WebElement cartBtn = driver.findElement(By.id("hlb-view-cart-announce"));
        cartBtn.click();

        WebElement cartArticle = driver.findElement(By.cssSelector(".sc-product-title"));
        String cartArticleName = cartArticle.getText();

        Assert.assertEquals(articleName, cartArticleName);
        takeScreenshot(driver, "Article_Actual");

        long start = System.currentTimeMillis();
        int q = 0;
        File file1 = new File("/../Screenshots/BufferedWriter_Article.txt");

        FileWriter fw = new FileWriter(file1.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        File fileA = new File("/../Screenshots/Expected/Article_Expected.png");
        BufferedImage image = ImageIO.read(fileA);
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        int[][] clr = new int[width][height];

        File fileB = new File("/../Screenshots/Actual/Article_Actual.png");
        BufferedImage images = ImageIO.read(fileB);
        int widthe = images.getWidth(null);
        int heighte = images.getHeight(null);
        int[][] clre = new int[widthe][heighte];
        int smw = 0;
        int smh = 0;
        int p = 0;

        for (int a = 0; a < smw; a++) {
            for (int b = 0; b < smh; b++) {
                clre[a][b] = images.getRGB(a, b);
                clr[a][b] = image.getRGB(a, b);
                if (clr[a][b] == clre[a][b]) {
                    p = p + 1;
                    bw.write("\t");
                    bw.write(Integer.toString(a));
                    bw.write("\t");
                    bw.write(Integer.toString(b));
                    bw.write("\n");
                } else
                    q = q + 1;
            }
        }

        float w, h = 0;
        if (width > widthe) {
            w = width;
        } else {
            w = widthe;
        }
        if (height > heighte) {
            h = height;
        } else {
            h = heighte;
        }
        float s = (smw * smh);
        float x = (100 * p) / s;

        long stop = System.currentTimeMillis();

        if (x > 95) {
            test.pass(MarkupHelper.createLabel("[PASSED] STEP 9 - Compare actual screenshot with screenshot from data base", ExtentColor.GREEN));
            test.pass(String.valueOf("Success rate = " + x + "%"));
            test.pass(String.valueOf("Time for visualization check = " + (stop - start)));
            test.pass(String.valueOf("Number of pixels gets varied = " + q));
            test.pass(String.valueOf("Number of pixels gets matched = " + p));
            test.pass("[ ACTUAL PAGE VIEW ]", MediaEntityBuilder.createScreenCaptureFromPath("/../Screenshots/Actual/Article_Actual.png").build());
        }
        if (x == 95) {
            test.warning(MarkupHelper.createLabel("[WARNING] STEP 9 - Compare actual screenshot with screenshot from data base", ExtentColor.ORANGE));
            test.warning(String.valueOf("Success rate = " + x + "%"));
            test.warning(String.valueOf("Time for visualization check = " + (stop - start)));
            test.warning(String.valueOf("Number of pixels gets varied = " + q));
            test.warning(String.valueOf("Number of pixels gets matched = " + p));
            test.warning("[ ACTUAL PAGE VIEW ]", MediaEntityBuilder.createScreenCaptureFromPath("/../Screenshots/Actual/Article_Actual.png").build());
            test.warning("[ EXPECTED PAGE VIEW ]", MediaEntityBuilder.createScreenCaptureFromPath("/../Screenshots/Expected/Article_Expected.png").build());
        }
        if (x < 95) {
            test.fail(MarkupHelper.createLabel("[FAILED] STEP 9 - Compare actual screenshot with screenshot from data base", ExtentColor.RED));
            test.fail(String.valueOf("Success rate = " + x + "%"));
            test.fail(String.valueOf("Time for visualization check = " + (stop - start)));
            test.fail(String.valueOf("Number of pixels gets varied = " + q));
            test.fail(String.valueOf("Number of pixels gets matched = " + p));
            test.fail("[ ACTUAL PAGE VIEW ]", MediaEntityBuilder.createScreenCaptureFromPath("/../Screenshots/Actual/Article_Actual.png").build());
            test.fail("[ EXPECTED PAGE VIEW ]", MediaEntityBuilder.createScreenCaptureFromPath("/../Screenshots/Expected/Article_Expected.png").build());
        }
    }
}


