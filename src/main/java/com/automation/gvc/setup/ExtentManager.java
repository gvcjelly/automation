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

    private static String htmlPath = "/../report/TestReport.html";
    private static String confPath = "/../src/main/resources/extent-config.xml";
    private static String osName = System.getProperty("os.name");
    private static String osVersion = System.getProperty("os.version");
    private static String osArch = System.getProperty("os.arch");

    public static ExtentReports GetExtent() {
        if (extent != null)
            return extent;
            extent = new ExtentReports();
            extent.attachReporter(getHtmlReporter());
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Project Name", "MS2");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Browser Version", "65.0.3325.181");
            extent.setSystemInfo("OS", osName);
            extent.setSystemInfo("OS Version", osVersion);
            extent.setSystemInfo("OS Arch", osArch);
            return extent;
    }

    private static ExtentHtmlReporter getHtmlReporter() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + htmlPath);
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + confPath);
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
