package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;
import static lippia.web.constants.SuperiorNavigationBarConstants.ACCOUNT_MENU_BUTTON;


public class SuperiorBarNavigationBarService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }


    public static void tapMenu( ) {
        WebActionManager.click( SHOP_MENU_BUTTON );
    }

    public static void tapAccount( ) {
        WebActionManager.click( ACCOUNT_MENU_BUTTON );
    }
}
