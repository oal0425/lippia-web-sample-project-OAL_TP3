package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.services.ShopService;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.MyAccountConstants.*;
import static lippia.web.constants.ShopConstants.*;

public class MyAccountSteps extends PageSteps {

    // Last methods, where a username is entered


    // Last methods, where a password is entered
    @And("Enter a registered username {}")
    public void enterUsernameLogin(String username) {
        MyAccountService.enterLoginUser(username);
    }

    @And("Enter a registered password {}")
    public void enterPasswordLogin(String password) {
        MyAccountService.enterLoginPassword(password);
    }


    @And("Click on login button")
    public void clickLogin(){
        MyAccountService.clickLoginButton();
    }

    @And("User must successfully login to the web page")
    public void theClientSeeLoginSuccess(  ) {
        MyAccountService.verifyRegistrationSuccess();
    }
    @And("Click on MyAccount link")
    public void clickMyAccountLink(  ){
        MyAccountService.clickMyAccountButton();
    }

    @And("Click on Orders link")
    public void clickOrdersLink(  ){
        MyAccountService.clickOrdersButton();
    }



    @Then("User must view Dashboard of the site")
    public void userMustViewDashboardOfTheSite() {
        MyAccountService.verifyDashboardText();

    }

    //Login2 steps
    @And("Enter incorrect username {}")
    public void enterIncorrectUsername(String username) {
        MyAccountService.enterLoginUser(username);
    }


    @And("Enter incorrect password {}")
    public void enterIncorrectPassword(String password) {
        MyAccountService.enterLoginPassword(password);
    }


    @Then("Proper error must be displayed {}")
    public void properErrorMustBeDisplayed(String mensaje) {
        System.out.println(mensaje);
    }


    //Login3
    @And("Enter empty password {}")
    public void enterEmptyPassword(String password) {
        MyAccountService.enterLoginPassword("");
    }


    @Then("Empty password error {}")
    public void emptyPasswordError(String mensaje) {
        System.out.println(mensaje);
    }

    @And("prompt to enter login again")
    public void promptToEnterLoginAgain() {
    }

    // MyAccount Steps
    @And("Click view button")
    public void clickViewButton() {
        MyAccountService.clickViewButton();
    }

    @Then("User must view their orders")
    public void userMustViewTheirOrders() {
        MyAccountService.verifyOrderDetailsView();
    }

    @Then("User must view his Orders, Customer and Billing details")
    public void userMustViewHisOrdersCustomerAndBillingDetails() {
        MyAccountService.verifyOrderDetailsViewExisting();
    }


    //My Account Registration

    @And("The client enters an email {}")
    public void theClientEntersRegisteredEmail(String email) {
        MyAccountService.enterEmail(email);
    }


    @And("The client enters is own password {}")
    public void theClientEntersIsOwnPassword(String password) {
        MyAccountService.enterRegistrationPassword(password);
    }


    @And("The client clicks on Register button")
    public void theClientClicksOnRegisterButton() {
        MyAccountService.clickRegisterButton();
    }

    @Then("The client will be registered successfully")
    public void theClientWillBeRegisteredSuccessfully() {
        MyAccountService.verifyDashboardMessage();
    }


    @And("The client enters an empty email {}")
    public void theClientEntersAnEmptyEmail(String email) {
        MyAccountService.enterEmptyEmail("");
    }

    @Then("Registration fails")
    public void registrationFails() {
        MyAccountService.verifyRegistrationError();

    }


    @And("The client enters an invalid email {}")
    public void theClientEntersAnInvalidEmail(String email) {
        MyAccountService.enterInvalidEmail(email);
    }
}
