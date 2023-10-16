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

    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {
        ShopService.verifyPage();
    }



    @And("The client sort by Average ratings in Default sorting dropdown")
    public void theClientTapDefaultSorting(){
        ShopService.tapDefaultSorting();
    }

    @Then( "The client taps on Android Category" )
    public void theClientTapOnAndroidCategory(  ) {
        ShopService.tapAndroidCategory();
    }

    @Then( "The client sees Default Sorting" )
    public void theClientSeeDefaultSorting(  ) {
        ShopService.verifyPageDefaultSorting();
    }



































}
