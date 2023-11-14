package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

import static com.crowdar.core.actions.ActionManager.setInput;

public class MyAccountSteps extends PageSteps {

//region MyAccount

    @When( "The client taps on My Account menu" )
    public void theClientTapsOnAccount() {
        SuperiorBarNavigationBarService.tapAccount();
    }

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
    public void userMustSuccessfullyLoginToTheWebPage() {
        MyAccountService.verifyDashboardText();
    }

    @And("Click on MyAccount link")
    public void clickOnMyAccountLink() {
        SuperiorBarNavigationBarService.tapAccount();
    }

    @And("Click on Account details")
    public void clickOnAccountDetails() {
        MyAccountService.clickAccountDetails();
    }

    @Then("User can view account details")
    public void userCanViewAccountDetails() {
        MyAccountService.verifyAccountDetails();
    }

    @Then("Click on Logout button")
    public void clickOnLogoutButton() {
        MyAccountService.clickLogOutButton();
    }

    @Then("User successfully comes out from the site")
    public void userSuccessfullyComesOutFromTheSite() {
        MyAccountService.verifyCustomerLogin();
    }

    // MY ACCOUNT LOGIN
    @And("Enter case changed username {}")
    public void enterCaseChangedUsername(String text) {
        MyAccountService.enterCaseUsername(text);
    }

    @And("Enter case changed password {}")
    public void enterCaseChangedPassword(String text) {
        MyAccountService.enterCasePassword(text);
    }

    @And("click back button")
    public void clickOnBackButton() {
        MyAccountService.clickBackButton();
    }

    @Then("Login must fail saying {}")
    public void loginMustFailSaying(String text) {
        MyAccountService.errorLoginMessageDisplay(text);
    }

    @Then("general webpage must be visible")
    public void generalWebpageMustBeVisible() {
        MyAccountService.verifyCustomerLogin();
    }

    // My Account Registration
    @And("The client enters a valid email {}")
    public void theClientEntersRegisteredEmail(String email) {
        MyAccountService.enterRegistrationEmail(email);
    }

    @And("The client enters an empty password {}")
    public void theClientEntersAnEmptyPassword(String password) {
        MyAccountService.enterRegistrationPassword(password);
    }

    @And("The client clicks on Register button")
    public void theClientClicksOnRegisterButton() {
        MyAccountService.clickRegisterButton();
    }

    @Then("Registration fails")
    public void registrationFailsPassword() {
        MyAccountService.verifyRegistrationErrorPassword();
    }

    @And("The client enters an empty email {}")
    public void theClientEntersAnEmptyEmail(String arg0) {
        MyAccountService.enterEmptyEmail("");
    }

    @Then("Empty password error {}")
    public void emptyPasswordError(String text) {
        MyAccountService.errorRegistrationMessage(text);
    }

    @And("Registration fails email")
    public void registrationFailsEmail() {
        MyAccountService.verifyRegistrationErrorEmail();
    }



    //..endregion

}
