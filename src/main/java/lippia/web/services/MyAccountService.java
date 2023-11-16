package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import javax.swing.*;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountService {

    public static void enterLoginUser(String text) {
        setInput(MyAccountConstants.INPUT_USERNAME_XPATH, text);
    }

    public static void enterLoginPassword(String text) {
        setInput(MyAccountConstants.INPUT_PASSWORD_LOGIN_XPATH, text);
    }

    public static void clickLoginButton( ) {
        WebActionManager.click(LOGIN_BUTTON);
    }

    public static void enterEmptyEmail(String text) {
        setInput(MyAccountConstants.INPUT_EMAIL_XPATH, text);
    }

    public static void verifyDashboardText() {
        Assert.assertTrue(ActionManager.waitPresence(DASHBOARD_TEXT_XPATH).isDisplayed());
    }

    public static void clickAccountDetails() {
        WebActionManager.click(MY_ACCOUNT_DETAILS);
    }


    public static void verifyAccountDetails() {
        Assert.assertTrue(ActionManager.waitPresence(MY_ACCOUNT_CONTENT).isDisplayed());
    }

    public static void clickLogOutButton() {
        WebActionManager.click(LOGOUT_BUTTON);
    }

    public static void verifyCustomerLogin() {
        Assert.assertTrue(ActionManager.waitPresence(CUSTOMER_LOGIN).isDisplayed());
    }

    public static void enterCaseUsername(String text) {
        setInput(MyAccountConstants.INPUT_USERNAME_XPATH, text);
    }

    public static void enterCasePassword(String text) {
        setInput(MyAccountConstants.INPUT_PASSWORD_LOGIN_XPATH, text);
    }


    public static void errorLoginMessageDisplay(String mensaje) {
        System.out.println(mensaje);
    }

    public static void clickBackButton() {
        WebActionManager.switchToLastTab();
    }

    public static void enterRegistrationEmail(String text) {
        int i = (int) (Math.random() * 50 + 1);
        setInput(MyAccountConstants.INPUT_EMAIL_XPATH, i+text);

    }

    public static void enterRegistrationPassword(String password) {
        setInput(MyAccountConstants.INPUT_PASSWORD_REGISTER_XPATH, password);
    }

    public static void clickRegisterButton() {
        WebActionManager.click(REGISTER_BUTTON_XPATH);
    }

    public static void verifyRegistrationErrorPassword() {
        Assert.assertTrue(ActionManager.isPresent(REGISTER_ERROR_MESSAGE_PASSWORD_XPATH));
    }

    public static void errorRegistrationMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public static void verifyRegistrationErrorEmail() {
        Assert.assertTrue(ActionManager.isPresent(REGISTER_ERROR_MESSAGE_XPATH));
    }
}
