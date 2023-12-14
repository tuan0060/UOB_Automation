package com.oneempower.olsoneadmin.page.MerchantManagement;

import com.oneempower.olsoneadmin.base.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CorporationConfig extends Sleep {

    private WebDriver driver;

    @FindBy (xpath = "//*[@id=\"groupId_4095\"]/a/span[1]")
    private WebElement moduleMerchantManage;

    @FindBy(xpath = "//*[@id=\"4095\"]/a")
    private WebElement moduleCorporation;

    @FindBy(id = "addRecordBtn_4095")
    private WebElement addCoporation;

    @FindBy(id = "generate-id-1464")
    private WebElement generateId;

    @FindBy(id = "R_1466")
    private WebElement corporationName;

    @FindBy (id = "R_1468")
    private WebElement contactPerson;

    @FindBy (id = "R_8900")
    private WebElement addressLine1;

    @FindBy(id = "R_8901")
    private WebElement addressLine2;

    @FindBy(id = "R_409516")
    private WebElement addressLine3;

    @FindBy(id = "R_409517")
    private WebElement addressLine4;

    @FindBy(id = "R_409518")
    private WebElement zipCode;

    @FindBy(id = "R_1452")
    private WebElement phoneNumber;

    @FindBy(id = "R_409519")
    private WebElement cardBrandVisa;

    @FindBy(id = "R_409520")
    private WebElement discountRateVisa;

    @FindBy(id = "R_409521")
    private WebElement cardBrandMasterCard;

    @FindBy(id = "R_409522")
    private WebElement discountRateMasterCard;

    @FindBy(id = "R_409523")
    private WebElement cardBrandJcb;

    @FindBy(id = "R_409524")
    private WebElement discountRateJcb;

    @FindBy(id = "R_409525")
    private WebElement cardBrandPlc;

    @FindBy(id = "R_409526")
    private WebElement discountRatePlc;

    @FindBy(id = "R_409527")
    private WebElement cardBrand5;

    @FindBy(id = "R_409528")
    private WebElement discountRate5;

    @FindBy(id = "R_409529")
    private WebElement cardBrand6;

    @FindBy(id = "R_409530")
    private WebElement discountRate6;

    @FindBy(id = "R_409531")
    private WebElement cardBrand7;

    @FindBy(id = "R_409532")
    private WebElement discountRate7;

    @FindBy(id = "R_409533")
    private WebElement cardBrand8;

    @FindBy(id = "R_409534")
    private WebElement discountRate8;

    @FindBy(id = "R_409535")
    private WebElement cardBrand9;

    @FindBy(id = "R_409536")
    private WebElement discountRate9;

    @FindBy(id = "R_409537")
    private WebElement merchantSatus;

    @FindBy(id = "R_409538")
    private WebElement merchantCategoryCode;

    @FindBy(xpath = "//*[@id=\"formDetails_4095\"]/div/div[1]/div/div[3]/button[2]")
    private WebElement buttonSave;

    @FindBy(xpath = "//*[@id=\"infoMessagesDialog\"]/div/div/div[3]/button")
    private WebElement buttonOk;
    @FindBy(xpath = "//*[@id=\"basicSearchBtn_4095\"]")
    private WebElement buttonSearch;



    @FindBy(xpath = "//*[@id=\"formDetails_4095\"]/div/div[1]/div/div[3]/button[3]")
    private WebElement buttonApprove;

    @FindBy(xpath = "//*[@id=\"infoMessagesDialog\"]/div/div/div[3]/button")
    private  WebElement confirmApprove;


    public CorporationConfig(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addCorporation() throws InterruptedException {
        moduleMerchantManage.click();
        sleep(500);
        moduleCorporation.click();
        sleep(500);
        addCoporation.click();
        sleep(500);
        generateId.click();
        sleep(500);
        corporationName.sendKeys("test");
        sleep(500);
        contactPerson.sendKeys("Tuan");
        sleep(500);
        addressLine1.sendKeys("Ha Noi");
        sleep(500);
        addressLine2.sendKeys("Ha Noi");
        sleep(500);
        addressLine3.sendKeys("Ha Noi");
        sleep(500);
        addressLine4.sendKeys("Ha Noi");
        sleep(500);
        zipCode.sendKeys("012341");
        sleep(500);
        phoneNumber.sendKeys("0978593318");
        sleep(500);
        cardBrandVisa.sendKeys("Credit");
        sleep(500);
        discountRateVisa.sendKeys("25");
        sleep(500);
        cardBrandMasterCard.sendKeys("Credit");
        sleep(500);
        discountRateMasterCard.sendKeys("0");
        sleep(500);
        cardBrandJcb.sendKeys("Credit");
        sleep(500);
        discountRateJcb.sendKeys("20");
        sleep(500);
        cardBrandPlc.sendKeys("Credit");
        sleep(500);
        discountRatePlc.sendKeys("15");
        sleep(500);
        cardBrand5.sendKeys("Credit");
        sleep(500);
        discountRate5.sendKeys("10");
        sleep(500);
        cardBrand6.sendKeys("Credit");
        sleep(500);
        discountRate6.sendKeys("7");
        sleep(500);
        cardBrand7.sendKeys("Credit");
        sleep(500);
        discountRate7.sendKeys("8");
        sleep(500);
        cardBrand8.sendKeys("Credit");
        sleep(500);
        discountRate8.sendKeys("3");
        sleep(500);
        cardBrand9.sendKeys("Credit");
        sleep(500);
        discountRate9.sendKeys("2");
        sleep(500);
        merchantSatus.sendKeys("A");
        sleep(500);
        merchantCategoryCode.sendKeys("Category");
        sleep(500);
        buttonSave.click();
        sleep(500);
        buttonOk.click();
        sleep(500);
        Select status = new Select(driver.findElement(By.id("filterStatus_4095")));
        status.selectByIndex(1);
        sleep(500);
        buttonSearch.click();
        sleep(500);
        WebElement table = driver.findElement(By.id("resultsList_4095"));
        WebElement last_cell = table.findElement(By.xpath(".//tr[1]/td[last()]"));
        last_cell.click();
        sleep(500);
        buttonApprove.click();
        sleep(500);
        confirmApprove.click();
        sleep(2000);

    }



}
