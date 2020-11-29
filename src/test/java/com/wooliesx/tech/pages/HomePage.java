package com.wooliesx.tech.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wooliesx.tech.datamodel.Product;

public class HomePage extends BasePage {
    List<Product>               productItems;

    @FindBy(css = "#homefeatured")
    private WebElement          productListElement;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart(WebElement parentElement, int itemindex) throws InterruptedException {

            WebElement productImage = driver.findElement(By.xpath("//*[@id='homefeatured']/li[" + itemindex
                                                                  + "]//a[1]//img[1]"));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productImage);

            Actions builder       = new Actions(driver);
            Action  mouseOverHome = builder.moveToElement(productImage).build();

            mouseOverHome.perform();

            WebDriverWait wait             = new WebDriverWait(driver, defaultWaitTimeInSeconds);
            WebElement    AddtoCartElement = driver.findElement(By.xpath("//*[@id='homefeatured']/li[" + itemindex                                                                         + "]//a[1]//span[text()='Add to cart']"));

            wait.until(ExpectedConditions.elementToBeClickable(AddtoCartElement));
            AddtoCartElement.click();

    }

    public void addRandomProductsToCart(List<Product> productList) throws InterruptedException {
        List<WebElement> productChildItem = productListElement.findElements(By.xpath("li"));
        int              index            = 0;
        Product          productItemOne   = new Product();

        addProductToCart(productChildItem.get(index), index + 1);
        productItemOne.setPrice(getPriceofItem(index + 1));
        productItemOne.setProductName(getProductName(index + 1));
        productList.add(productItemOne);
        continueShopping();
        productChildItem = productListElement.findElements(By.xpath("li"));
        addProductToCart(productChildItem.get(index + 1), index + 2);

        Product productItemSecond = new Product();

        productItemSecond.setPrice(getPriceofItem(index + 2));
        productItemSecond.setProductName(getProductName(index + 2));
        productList.add(productItemSecond);
    }

    private void continueShopping() {
        waitforElementToBeVisible(By.xpath("//*[@id='layer_cart']//*[@title='Continue shopping']"), defaultWaitTimeInSeconds);
        driver.findElement(By.xpath("//*[@id='layer_cart']//*[@title='Continue shopping']")).click();
    }

    public void navigateToEcommerce(String url) {
        driver.get(url);
    }

    public void proceedToCheckout() {
        waitforElementToBeVisible(By.xpath("//*[@id='layer_cart']//*[@title='Proceed to checkout']"), defaultWaitTimeInSeconds);
        driver.findElement(By.xpath("//*[@id='layer_cart']//*[@title='Proceed to checkout']")).click();
    }


    public Double getPriceofItem(int itemIndex) {
        String price = driver.findElement(By.xpath("//*[@id='homefeatured']/li[" + itemIndex
                                                   + "]//span[@itemprop='price']"))
                             .getText()
                             .replace("$", "")
                             .trim();

        return Double.parseDouble(price);
    }

    public String getProductName(int itemIndex) {
        return driver.findElement(By.xpath("//*[@id='homefeatured']/li[" + itemIndex + "]//a[@class='product-name']"))
                     .getText()
                     .trim();
    }
}


