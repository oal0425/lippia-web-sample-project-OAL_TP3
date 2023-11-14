package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static lippia.web.constants.HomeConstants.*;


public class HomeService {
    public static void tapHome( ) {
        WebActionManager.navigateTo("https://practice.automationtesting.in/");
    }
    public static void tapNextArrival() {
        WebActionManager.click(ARRIVAL_IMAGE_1);
    }

    public static void verifyNavigateArrivalNextPage() {
        Assert.assertTrue( ActionManager.waitPresence(ARRIVAL_DETAILS_XPATH).isDisplayed() );
    }


    public static void clickAddToBasketButton() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        Actions builder = new Actions(driver);
        WebElement elem = WebActionManager.getElement(ADD_TO_BASKET_HOME);
        builder.moveToElement(elem).click().build().perform();



        

    }
}
