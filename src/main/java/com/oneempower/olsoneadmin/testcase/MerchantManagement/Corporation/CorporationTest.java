package com.oneempower.olsoneadmin.testcase.MerchantManagement.Corporation;

import com.oneempower.olsoneadmin.base.Basesetup;
import com.oneempower.olsoneadmin.helpers.RecordVideo;
import com.oneempower.olsoneadmin.page.MerchantManagement.CorporationConfig;
import com.oneempower.olsoneadmin.page.SigninPageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CorporationTest extends Basesetup {

    private WebDriver driver;

    public CorporationConfig corporationConfig;

    private SigninPageFactory factory;

    @BeforeClass
    public void setUp() throws Exception {
        driver = getDriver();
        RecordVideo.startRecord("Corporation");
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    @Test
    public void addCorporation() throws Exception {
        factory = new SigninPageFactory(driver);
        factory.signin("olsadmin", "Oev@12345");
        corporationConfig = new CorporationConfig(driver);
        corporationConfig.addCorporation();
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//        FileHandler.copy(source, new File("./MerchantManagement/" +"/Corporation/" + "Add" + ".png"));


    }

//    @AfterMethod
//    public void takeScreenshot(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
//                File theDir = new File("./MerchantManagement/" +"/Corporation/");
//
//                if (!theDir.exists()) {
//                    theDir.mkdir();
//                }
//                FileHandler.copy(source, new File("./MerchantManagement/" +"/Corporation/" + result.getName() + ".png"));
//
//            } catch (Exception e) {
//                System.out.println("Failed " + e.getMessage());
//            }
//        }
//    }

    @AfterClass
    public void tearDownClass() throws Exception {
        RecordVideo.stopRecord();
        driver.quit();
    }
}
