package com.wooliesx.tech.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {
    int                defaultWaitTimeInSeconds = 10;
    @Autowired
    WebDriver          driver;
    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUs1;
    @FindBy(css = "a[title='Manage my customer account']")
    private WebElement myAccount;
    @FindBy(css = "a[title='My orders']")
    private WebElement myOrders;

    @Autowired
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }

    public void selectValueByText(WebElement element, String value) {
        Select select = new Select(element);

        select.selectByVisibleText(value);
    }

    public void waitforElementToBeVisible(By by, int timeInSecondds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSecondds);

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    

    public void waitforElementToBeVisible(WebElement element, int timeInSecondds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSecondds);

        wait.until(ExpectedConditions.visibilityOf(element));
    }
}


