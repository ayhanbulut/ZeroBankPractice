package com.zero.pages;

import com.zero.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newpayment extends com.zero.pages.BasePage {


    @FindBy(id = "pay_bills_tab")
    public WebElement PayBill;

    @FindBy(xpath = "//*[@id=\"tabs\"]/ul/li[2]/a")
    public WebElement AddNewPaymee;

    @FindBy(id = "np_new_payee_name")
    public WebElement PayeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement PayeeAdress;

    @FindBy(id = "np_new_payee_account")
    public WebElement PayeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement PayeeDetail;

    @FindBy(id = "add_new_payee")
    public WebElement Add;

    @FindBy(id = "alert_content")
     public WebElement message;


    public void Payment(String PayeeName, String PayeeAdress,String PayeeAccount,String PayeeDetail) {
        Newpayment np = new Newpayment();

        np.PayeeName.sendKeys(PayeeName);
        np.PayeeAdress.sendKeys(PayeeAdress);
        np.PayeeAccount.sendKeys(PayeeAccount);
        np.PayeeDetail.sendKeys(PayeeDetail);
          BrowserUtils.waitFor(10);
        np.Add.click();


    }
}
