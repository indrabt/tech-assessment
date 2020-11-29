package com.wooliesx.tech.pages;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wooliesx.tech.datamodel.Product;

public class SummaryPage extends BasePage {
    @FindBy(css = "#total_product")
    private WebElement totalProductPrice;
    @FindBy(css = "#total_shipping")
    private WebElement totalShippingPrice;
    @FindBy(xpath = "//div[@id='center_column']//a[@title='Proceed to checkout']/span")
    private WebElement proceedToCheckOut;

    public SummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout() {
        proceedToCheckOut.click();
    }

    public boolean verifyTotalProductPrice(List<Product> productlist) {
        Double     totalpriceFromHomePage    = productlist.get(1).getPrice() + productlist.get(2).getPrice();
        Double     totalpriceFromSummaryPage = Double.parseDouble(totalProductPrice.getText().trim().replace("$", ""));
        BigDecimal bd                        = new BigDecimal(totalpriceFromHomePage).setScale(2, RoundingMode.HALF_UP);

        totalpriceFromHomePage = bd.doubleValue();

        if (totalpriceFromHomePage.equals(totalpriceFromSummaryPage)) {
            return true;
        } else {
            return false;
        }
    }

    public double getTotalShippingPrice() {
        return Double.parseDouble(totalShippingPrice.getText().trim().replace("$", ""));
    }
}



