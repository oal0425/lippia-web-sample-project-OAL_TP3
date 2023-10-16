package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.HomeConstants.*;

public class HomeService {
    public static void tapHome( ) {
        WebActionManager.navigateTo("https://practice.automationtesting.in/");
    }

    public static void verifyPageSliders() {
        int i = 0;
        while (i<3)
        {
            ActionManager.click(SLIDER_ARROW_NEXT);
            i++;
        }
        Assert.assertTrue(i==2);
    }

    public static void verifyPageArrivals() {
        List<WebElement> arrivals = ActionManager.getElements(ARRIVAL_CONTAINER);
        Assert.assertTrue( arrivals.size() == 3 );
    }

    public static void tapNextArrival() {
        WebActionManager.click(ARRIVAL_IMAGE_1);
    }

    public static void enterUsername(String text) {
        setInput(HomeConstants.INPUT_USERNAME_XPATH, text);
    }


}
