package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage  extends Utility
{
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement clickOnLogin;

    //Enter “standard_user” username
    public void enterUserName(String username)
    {
        Reporter.log("Enter “standard_user” username" + userNameField.toString());
        sendTextToElement(userNameField,username);
        log.info("Enter username : " + userNameField.toString());

    }

    //Enter “secret_sauce” password
    public void enterPassword(String password)
    {
        Reporter.log("//Enter “secret_sauce” password" + passwordField.toString() +"<br>");
        sendTextToElement(passwordField,password);
        log.info("Enter password : " + passwordField.toString() + "<br>");

    }

    // Click on ‘LOGIN’ button
    public void clickOnLoginButton()
    {
        Reporter.log("// Click on ‘LOGIN’ button" + clickOnLogin + "<br>");
        clickOnElement(clickOnLogin);
        log.info("Click on login button : " +clickOnLogin + "<br>");

    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement verifyProduct;

    //Verify the text “PRODUCTS”
    public String verifyProduct()
    {
        Reporter.log("//Verify the text “PRODUCTS”");
        String verifyProducts = getTextFromElement(verifyProduct);
        log.info("Getting text from : " + verifyProduct.toString());
        return verifyProducts;
    }
}
