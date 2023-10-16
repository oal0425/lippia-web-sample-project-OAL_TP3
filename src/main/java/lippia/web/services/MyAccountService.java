package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountService {

    public static void clickLoginButton( ) {
        WebActionManager.click(LOGIN_BUTTON);
    }
    public static void clickRegisterButton( ) {
        WebActionManager.click(REGISTER_BUTTON_XPATH);
    }

    public static void clickViewButton( ) {
        WebActionManager.click(VIEW_BUTTON_XPATH);
    }

    public static void clickMyAccountButton( ) {
        SuperiorBarNavigationBarService.tapAccount();
    }
    public static void clickOrdersButton( ) {
        WebActionManager.click(MY_ORDERS_LINK_XPATH);
    }


    public static void enterLoginUser(String text) {
        setInput(MyAccountConstants.INPUT_USERNAME_XPATH, text);
    } //CAMBIAR LAS CONSTANTES

    public static void enterLoginPassword(String text) {
        setInput(MyAccountConstants.INPUT_PASSWORD_LOGIN_XPATH, text);
    } //CAMBIAR LAS CONSTANTES

    public static void enterIncorrectLoginUser(String text) {
        setInput(MyAccountConstants.INPUT_USERNAME_XPATH, text);
    }

    public static void enterIncorrectLoginPassword(String text) {
        setInput(MyAccountConstants.INPUT_PASSWORD_LOGIN_XPATH, text);
    }

    public static void enterRegistrationPassword(String text) {
        setInput(MyAccountConstants.INPUT_PASSWORD_REGISTER_XPATH, text);
    }

    public static void enterEmail(String text) {
        setInput(MyAccountConstants.INPUT_EMAIL_XPATH, text);
    } //CAMBIAR LAS CONSTANTES


    public static void verifyRegistrationError() {
        Assert.assertTrue( ActionManager.waitPresence(REGISTER_ERROR_MESSAGE_XPATH).isDisplayed() );
    }

    public static void verifyRegistrationSuccess() {
        Assert.assertTrue( ActionManager.waitPresence(REGISTER_SUCCESS_MESSAGE_XPATH).isDisplayed() );
    }


    public static void verifyDashboard() {
        Assert.assertTrue( ActionManager.waitPresence(DASHBOARD_LINK_XPATH).isDisplayed() );
    }

    public static void verifyOrders() {
        Assert.assertTrue( ActionManager.waitPresence(ORDERS_INF_XPATH).isDisplayed() );
    }

    public static void verifyOrderDetailsViewExisting() {
        MyAccountService.clickViewButton();
        Assert.assertTrue( ActionManager.waitPresence(ORDER_DETAILS_XPATH).isDisplayed() );
    }


    public static void verifyDashboardText() {
        Assert.assertTrue(ActionManager.waitPresence(DASHBOARD_TEXT_XPATH).isDisplayed());
    }

    public static void verifyOrderDetailsView() {
        Assert.assertTrue(ActionManager.waitPresence(ORDERS_DETAILS_MIN_XPATH).isDisplayed());
    }
}
