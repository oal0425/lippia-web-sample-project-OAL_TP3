package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {
    @And("The client tap on Home menu")
    public void theClientTapOnHome(){
        HomeService.tapHome();
    }


    @And("The client see Three Arrivals")
    public void theClientSeeThreeArrivals() {

    }

    @And("The client enter to an Arrival")
    public void theClientEnterAnArrival(  ) {
        HomeService.tapNextArrival();
    }

    @And("should navigate to next page")
    public void shouldNavigateToNextPage() {
        HomeService.verifyNavigateArrivalNextPage();
    }


    @And("Click on the Add To Basket button")
    public void clickOnTheAddToBasketButton() {
        HomeService.clickAddToBasketButton();
    }


}
