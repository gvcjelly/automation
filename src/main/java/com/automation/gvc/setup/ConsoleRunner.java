package com.automation.gvc.setup;

import org.apache.commons.io.FileUtils;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class ConsoleRunner {


    public static void main(String[] args) throws Exception {

        String xmlFile = "testng.xml";
        Path xmlFrom = Paths.get(System.getProperty("user.dir") + "/../src/main/resources" + "/" + xmlFile);
        Path xmlTo = Paths.get(System.getProperty("user.dir") + "/" + xmlFile);
        Files.copy(xmlFrom, xmlTo, StandardCopyOption.REPLACE_EXISTING);

        String file = xmlTo + xmlFile;
        InputStream xmlSuiteStream = ConsoleRunner.class.getResourceAsStream(file);
        List<XmlSuite> suite = (List<XmlSuite>) new Parser(xmlSuiteStream).parse();

        TestNG testng = new TestNG();
        testng.setXmlSuites(suite);
        testng.run();
    }
}
