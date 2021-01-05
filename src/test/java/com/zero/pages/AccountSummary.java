package com.zero.pages;

import com.zero.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummary  extends BasePage {


    @FindBy(xpath = "(//*[@class='table']//a)[1]")
    public WebElement saving1;

    @FindBy(xpath = "(//*[@class='table']//a)[2]")
    public WebElement saving2;

    @FindBy(xpath = "(//*[@class='table']//a)[3]")
    public WebElement brokerage;

    @FindBy(xpath = "(//*[@class='table']//a)[4]")
    public WebElement checking;

    @FindBy(xpath = "(//*[@class='table']//a)[5]")
    public WebElement creditcard;


    @FindBy(xpath = "(//*[@class='table']//a)[6]")
    public WebElement loan;


    public void account(String name){

        if(name.contentEquals("Savings1")){
            BrowserUtils.waitFor(3);
            saving1.click();

        }else if(name.contentEquals("Savings2")){

            saving2.click();

    }else if(name.contentEquals("Brokerage")){

            brokerage.click();

    }else if(name.contentEquals("Checking")) {

            checking.click();

        }else if(name.contentEquals("Credit Card")){

            creditcard.click();

    }else if(name.contentEquals("Loan")){

            loan.click();

    }

}
}

