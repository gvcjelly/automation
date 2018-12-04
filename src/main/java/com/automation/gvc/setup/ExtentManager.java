package com.automation.gvc.setup;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    public static  ExtentReports extent;
    public static  ExtentTest test;
    private static ExtentHtmlReporter htmlReporter;

    private static String filePath = "./report/TestReport.html";

    public static ExtentReports GetExtent() {
        if (extent != null)
            return extent;
            extent = new ExtentReports();
            extent.attachReporter(getHtmlReporter());
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Project Name", "MS2");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Browser Version", "65.0.3325.181");
            extent.setSystemInfo("OS", "Windows");
            return extent;
    }

    private static ExtentHtmlReporter getHtmlReporter() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + filePath);
        htmlReporter.loadXMLConfig("../src/main/resources/extent-config.xml");
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setEncoding("UTF-8");
        return htmlReporter;
    }

    public static ExtentTest createTest(String name, String description) {
        test = extent.createTest(name, description);
        return test;
    }
}
