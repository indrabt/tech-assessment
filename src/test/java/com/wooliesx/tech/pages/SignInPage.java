package com.wooliesx.tech.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wooliesx.tech.datamodel.Address;
import com.wooliesx.tech.datamodel.Customer;

public class SignInPage extends BasePage {

    @FindBy(id = "SubmitLogin")
    private WebElement          signIn;
    @FindBy(id = "passwd")
    private WebElement          passwordElement;
    @FindBy(id = "email")
    private WebElement          emailElement;
    @FindBy(css = "input#email_create")
    private WebElement          emailcreateElement;
    @FindBy(css = "#customer_firstname")
    private WebElement          firstName;
    @FindBy(css = "input#customer_lastname")
    private WebElement          lastName;
    @FindBy(css = "input#passwd")
    private WebElement          createAccountPasswordElement;
    @FindBy(css = "select#days")
    private WebElement          days;
    @FindBy(css = "#months")
    private WebElement          monthELement;
    @FindBy(css = "#years")
    private WebElement          yearElement;
    @FindBy(css = "input#firstname")
    private WebElement          addressFirstnameElement;
    @FindBy(css = "input#lastname")
    private WebElement          addressLastNameElement;
    @FindBy(css = "input[name='address1']")
    private WebElement          streetAddress;
    @FindBy(css = "input#city")
    private WebElement          cityElement;
    @FindBy(css = "select#id_state")
    private WebElement          stateElement;
    @FindBy(css = "input#postcode")
    private WebElement          zipCodeELement;
    @FindBy(css = "select#id_country")
    private WebElement          countryELement;
    @FindBy(css = "input#phone_mobile")
    private WebElement          mobile;
    @FindBy(id = "SubmitCreate")
    private WebElement          createAccountElement;
    @FindBy(css = "button#submitAccount > span")
    private WebElement          registerElement;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

 
    public void createNewUserAccount(Customer customer, Address address) {
        emailcreateElement.sendKeys(customer.getEmail());
        createAccountElement.click();
        waitforElementToBeVisible(firstName, defaultWaitTimeInSeconds);
        firstName.clear();
        firstName.sendKeys(customer.getFirstName());
        lastName.clear();
        lastName.sendKeys(customer.getLastName());
        createAccountPasswordElement.sendKeys(customer.getPassword());
        addressFirstnameElement.clear();
        addressFirstnameElement.sendKeys(customer.getFirstName());
        addressLastNameElement.clear();
        addressLastNameElement.sendKeys(customer.getLastName());
        streetAddress.sendKeys(address.getStreetAddress());
        cityElement.sendKeys(address.getCity());
        selectValueByText(stateElement, address.getState());
        zipCodeELement.sendKeys(address.getZipcode());
        selectValueByText(countryELement, address.getCountry());
        mobile.sendKeys(address.getMobilePhone());
        registerElement.click();
    }

    public void enterUserCredential(String userName, String password) {
        emailElement.clear();
        emailElement.sendKeys(userName);
        passwordElement.clear();
        passwordElement.sendKeys(password);
        signIn.click();
    }
}


