package com.automation.gvc.setup;

import org.testng.TestNG;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ConsoleRunner {

    static String testXML;

    public void main(String[] args) throws Exception {

        String filePath = new String("src/main/resources");
        List<String> suites = new ArrayList<>();
        URL resource = getClass().getClassLoader().getResource("testng.xml");

        suites.add(((URL) resource).getFile());
        TestNG testng = new TestNG();
        testng.setTestSuites(suites);
        testng.run();
    }
}
