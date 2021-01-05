package com.zero.pages;


import com.zero.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="user_login")
    public WebElement userName;


    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signin;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        signin.click();
        // verification that we logged
    }


}
