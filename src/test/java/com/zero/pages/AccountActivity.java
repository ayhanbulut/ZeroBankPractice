package com.zero.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends com.zero.pages.BasePage {

@FindBy(id = "account_activity_tab")
    public WebElement accountact;


    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[1]")
    public WebElement savings1_opt;

    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[2]")
    public WebElement checking_opt;

    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[3]")
    public WebElement savings2_opt;

    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[4]")
    public WebElement loan_opt;

    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[5]")
    public WebElement creditcard_opt;

    @FindBy(xpath = "//*[@id=\"aa_accountId\"]/option[6]")
    public WebElement brokerage_opt;






}
