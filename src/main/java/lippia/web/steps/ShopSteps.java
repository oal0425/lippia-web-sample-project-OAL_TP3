package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;






public class ShopSteps extends PageSteps {

    @Given("The client is on testing page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When( "The client tap on Shop menu" )
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }

    //region Shop-Add to Basket-View Basket through Item link

    @And ("click on the add to basket button")
    public void addToBasketButton(){
        ShopService.clickAddToBasketButton();
    }

    @And("check Book in the Menu Item")
    public void checkBookInTheMenuItem() {
        ShopService.verifyMenuitem();
    }

    @And("click on Item link")
    public void clickOnItemLink() {
        ShopService.clickItemLink();
    }

    @And("user can find total and subtotal values")
    public void verifyTotalAndSubtotalValues() {
        ShopService.verifyTotalSubtotalValues();
    }

    @And("total is always major subtotal")
    public void verifyTotalSubtotalDifference() {
        ShopService.verifyTotalSubtotalAmount();
    }

    @And("click on Proceed to Check out button")
    public void clickOnProceedToCheckOutButton() {
        ShopService.clickCheckOutBtn();
    }

    @And("User can view billing details")
    public void userCanViewBillingDetails() {
        ShopService.verifyCustomerDetails();
    }


    @And("user can fill his details in billing details {},{},{},{},{},{},{},{},{},{}")
    public void userFillHisBillingDetails(String fname, String lname, String companyname, String email, String phone,String country, String address, String town, String state, String postcode) {
        String [] campos = {fname,lname,companyname,email,phone,country,address,town,state,postcode};
        ShopService.userFillBillingDetails(campos);
    }

    @And("can opt any payment in the payment gateway")
    public void paymentPaymentGateway() {
        ShopService.paymentGatewaySelectionCheque();
    }

    @And("click on Place Order button")
    public void clickOnPlaceOrderButton() {
        ShopService.clicPlaceOrderButton();
    }

    @Then("user navigates to Order confirmation page")
    public void userNavigatesToOrderConfirmationPage() {
        ShopService.verifyConfirmationPage();
    }

    @Then("Tax rate for indian should be two percent and for abroad it should be five percent")
    public void taxRateIndianDifferentAbroad() {
        ShopService.calculateTaxRate();

    }

    @And("user select his country {}")
    public void userSelectHisCountry(String country) {
        ShopService.userFillCountryDetails(country);
    }


    //..endregion


    //region


}
