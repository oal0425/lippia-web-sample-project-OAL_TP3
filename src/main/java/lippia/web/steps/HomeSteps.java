package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {
    @Then("The client tap on Home menu")
    public void theClientTapOnHome(){
        HomeService.tapHome();
    }

    @Then("The client see Three Sliders")
    public void theClientSeeSliders(  ) {
        HomeService.verifyPageSliders();
    }

    @Then("The client see Three Arrivals")
    public void theClientSeeArrivals(  ) {
       HomeService.verifyPageArrivals();
    }

    @Then("The client enter to an Arrival")
    public void theClientEnterAnArrival(  ) {
        HomeService.tapNextArrival();
    }



    //MyAccountSteps
    @When( "The client taps on My Account menu" )
    public void theClientTapsOnAccount() {
        SuperiorBarNavigationBarService.tapAccount();
    }

    @And("Enter registered ")
    public void enterUsername(String username){
        HomeService.enterUsername(username);
    }

























}
