package com.oneempower.olsoneadmin.testcase;

import com.oneempower.olsoneadmin.base.Basesetup;
import com.oneempower.olsoneadmin.helpers.RecordVideo;
import com.oneempower.olsoneadmin.page.SigninPageFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;

public class SigninTest extends Basesetup {
    private WebDriver driver;

    public SigninPageFactory factory;

    @BeforeClass
    public void setUp() throws Exception {
        driver = getDriver();
        RecordVideo.startRecord("Dashbroad");
    }

    @Test
    public void signIn() throws Exception {
        factory = new SigninPageFactory(driver);

        factory.signin("olsadmin", "Oev@12345");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(source, new File("./SignIn/" + "After Login" + ".png"));


    }


    @AfterMethod
    public void takeScreenshot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                File theDir = new File("./Screenshots/");

                if (!theDir.exists()) {
                    theDir.mkdir();
                }
                FileHandler.copy(source, new File("./Screenshots/" + result.getName() + ".png"));
                System.out.println("Đã chụp màn hình: " + result.getName());
            } catch (Exception e) {
                System.out.println("Failed " + e.getMessage());
            }
        }
    }

    @AfterClass
    public void tearDownClass() throws Exception {

        RecordVideo.stopRecord();
        driver.quit();
    }
}
