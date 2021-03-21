package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtil;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.swaglabs.base.BasePage.driver;

public class CheckoutStepOne {
    @FindBy(id = "first-name")
    private static WebElement firstName;

    @FindBy(id = "last-name")
    private static WebElement lastName;

    @FindBy(id = "postal-code")
    private static WebElement postalCode;

    @FindBy(xpath = "//input[@value='CONTINUE']")
    private static WebElement continueBtn;

    public CheckoutStepOne() {
        PageFactory.initElements(driver, this);
    }

    public static void sendOrderInformation(String name, String lName, String zipCode) {
        ElementUtil.doSendText(firstName, name);
        ElementUtil.doSendText(lastName, lName);
        ElementUtil.doSendText(postalCode, zipCode);

    }

    public static void clickContinue() {
        ElementUtil.doClick(continueBtn);
    }

}
