package com.oneempower.olsoneadmin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPageFactory{
    private  WebDriver driver;
    @FindBy(id = "userid")
    private WebElement inputuser;
    @FindBy(name = "pwd")
    private WebElement inputpass;
    @FindBy(xpath = "/html/body/div[1]/div[2]/form/div[3]/div[2]/button")
    private WebElement buttonsignin;

    public SigninPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void signin(String username, String password) throws Exception {
        inputuser.sendKeys(username);
        inputpass.sendKeys(password);
        buttonsignin.click();
        Thread.sleep(1000);
    }
}
