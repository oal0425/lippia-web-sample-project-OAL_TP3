package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import lippia.web.services.SuperiorBarNavigationBarService;

public class MyAccountSteps extends PageSteps {

//region MyAccount

    @When( "The client taps on My Account menu" )
    public void theClientTapsOnAccount() {
        SuperiorBarNavigationBarService.tapAccount();
    }

    //..endregion

}
