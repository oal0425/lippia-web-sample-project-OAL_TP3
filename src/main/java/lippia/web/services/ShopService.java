package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;
import static lippia.web.constants.ShopConstants.*;

public class ShopService {

    public static void tapAddToBasket( ) {
        WebActionManager.click(ADD_TO_BASKET_BTN);
    }

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
        Assert.assertTrue((ActionManager.waitPresence(SUBTOTAL_VALUE_TEXT).isDisplayed()) && (ActionManager.waitPresence(TOTAL_VALUE_TEXT).isDisplayed()));
    }

    public static String removefirstChar(String str)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(1);
    }
    public static void verifyTotalSubtotalAmount() {
        String subTotal = ActionManager.getElement(SUBTOTAL_VALUE_NUM).getText();
        String total = ActionManager.getElement(TOTAL_VALUE_NUM).getText();
        Assert.assertTrue(total.compareTo(subTotal)<0);
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
        setInput(ShopConstants.INPUT_ADDRESS_BILLING_DETAIL_XPATH, datos[5]);
        setInput(ShopConstants.INPUT_TOWN_BILLING_DETAIL_XPATH, datos[6]);
        setInput(ShopConstants.INPUT_POSTCODE_BILLING_DETAIL_XPATH, datos[7]);
        //setInput(ShopConstants.INPUT_COUNTRY_BILLING_DETAIL_XPATH, datos[5]);
        //setInput(ShopConstants.INPUT_STATE_BILLING_DETAIL_XPATH, datos[8]);
    }

    public static void paymentGatewaySelectionCheque() {
        WebActionManager.click(PAYMENT_METHOD_CHEQUE);
    }

    public static void paymentGatewaySelectionBacs() {
        WebActionManager.click(PAYMENT_METHOD_BACS);
    }
    public static void paymentGatewaySelectionCod() {
        WebActionManager.click(PAYMENT_METHOD_COD);
    }

    public static void paymentGatewaySelectionPayPal() {
        WebActionManager.click(PAYMENT_METHOD_PPEC_PAYPAL);
    }

    public static void clicPlaceOrderButton() {
        WebActionManager.click(PLACE_ORDER_BTN);
    }

    public static void verifyConfirmationPage() {
        Assert.assertTrue(ActionManager.waitPresence(CONFIRMATION_PAGE).isDisplayed());
    }
}
