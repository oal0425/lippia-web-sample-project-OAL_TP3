package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;

import static com.crowdar.core.actions.ActionManager.setInput;
import static java.lang.Float.parseFloat;
import static lippia.web.constants.HomeConstants.ADD_TO_BASKET_HOME;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;
import static lippia.web.constants.ShopConstants.*;

public class ShopService {

    public static void verifyMenuitem() {
        String item = ActionManager.getElement(MENU_CART_AMOUNT).getText();
        Assert.assertTrue(item != null);
    }

    public static void clickAddToBasketButton() {
        WebActionManager.navigateTo("https://practice.automationtesting.in/shop/?add-to-cart=169");
    }


    public static void clickItemLink() {
        WebActionManager.click(ITEM_LINK);
    }

    public static void verifyTotalSubtotalValues() {
        Assert.assertTrue((ActionManager.waitPresence(SUBTOTAL_VALUE_TEXT_ITEM_VIEW).isDisplayed()) && (ActionManager.waitPresence(TOTAL_VALUE_TEXT_ITEM_VIEW).isDisplayed()));
    }

    public static void verifyTotalSubtotalAmount() {
        String subTotal = ActionManager.getElement(SUBTOTAL_VALUE_TEXT_ITEM_VIEW).getText();
        String total = ActionManager.getElement(TOTAL_VALUE_TEXT_ITEM_VIEW).getText();
        Float subTotalNum = parseFloat(subTotal.substring(1,subTotal.length()));
        Float totalNum = parseFloat(total.substring(1,total.length()));
        Assert.assertTrue(totalNum>subTotalNum);
    }

    public static void clickCheckOutBtn() {
        WebActionManager.navigateTo("https://practice.automationtesting.in/checkout/");
    }

    public static void verifyCustomerDetails() {
        Assert.assertTrue(ActionManager.waitPresence(CUSTOMER_DETAILS_CONTAINER).isDisplayed());
    }


    public static void userFillBillingDetails(String [] datos) {
        setInput(ShopConstants.INPUT_FNAME_BILLING_DETAIL_XPATH, datos[0]);
        setInput(ShopConstants.INPUT_LNAME_BILLING_DETAIL_XPATH, datos[1]);
        setInput(ShopConstants.INPUT_COMPANYNAME_BILLING_DETAIL_XPATH, datos[2]);
        setInput(ShopConstants.INPUT_EMAIL_BILLING_DETAIL_XPATH, datos[3]);
        setInput(ShopConstants.INPUT_PHONE_BILLING_DETAIL_XPATH, datos[4]);
        ActionManager.click(COUNTRY_DROP_XPATH);
        ActionManager.setInput(COUNTRY_DROP_INPUT_SEARCH_XPATH, datos[5]);
        WebElement elemento= WebActionManager.getElement(COUNTRY_DROP_INPUT_SEARCH_XPATH, datos[5]);
        elemento.sendKeys(Keys.ENTER);
        setInput(ShopConstants.INPUT_ADDRESS_BILLING_DETAIL_XPATH, datos[6]);
        setInput(ShopConstants.INPUT_TOWN_BILLING_DETAIL_XPATH, datos[7]);
        ActionManager.click(STATE_DROP_XPATH);
        setInput(STATE_DROP_INPUT_SEARCH_XPATH, datos[8]);
        setInput(ShopConstants.INPUT_POSTCODE_BILLING_DETAIL_XPATH, datos[9]);
    }

    public static void paymentGatewaySelectionCheque() {
        WebActionManager.setCheckbox(PAYMENT_METHOD_CHEQUE,true);
    }

    public static void paymentGatewaySelectionBacs() {
        WebActionManager.setCheckbox(PAYMENT_METHOD_BACS,true);
    }
    public static void paymentGatewaySelectionCod() {
        WebActionManager.click(PAYMENT_METHOD_COD);
    }

    public static void paymentGatewaySelectionPayPal() {
        WebActionManager.click(PAYMENT_METHOD_PPEC_PAYPAL);
    }

    public static void clicPlaceOrderButton() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        Actions builder = new Actions(driver);
        WebElement elem = WebActionManager.getElement(PLACE_ORDER_BTN);
        builder.moveToElement(elem).click().build().perform();
    }

    public static void verifyConfirmationPage() {
        Assert.assertTrue(ActionManager.waitPresence(CONFIRMATION_PAGE).isDisplayed());
    }

    public static void calculateTaxRate(String country) {
        String subTotal = ActionManager.getElement(SUBTOTAL_VALUE_TEXT_BILLING_VIEW).getText();
        String total = ActionManager.getElement(TOTAL_VALUE_TEXT_BILLING_VIEW).getText();
        String tax = ActionManager.getElement(TAX_VALUE_TEXT_BILLING_VIEW).getText();
        float subTotalNum = parseFloat((subTotal.substring(1,subTotal.length())));
        float totalNum = parseFloat((total.substring(1,total.length())));
        float taxNum = parseFloat((tax.substring(1,tax.length())));
        Assert.assertEquals((subTotalNum+taxNum),totalNum);
    }

    public static void ExplicitWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void userFillCountryDetails(String country) {
        ActionManager.click(COUNTRY_DROP_XPATH);
        ActionManager.setInput(COUNTRY_DROP_INPUT_SEARCH_XPATH, country);
        WebElement elemento= WebActionManager.getElement(COUNTRY_DROP_INPUT_SEARCH_XPATH,country);
        elemento.sendKeys(Keys.ENTER);
    }
}
