package lippia.web.constants;

public class MyAccountConstants {

    public static final String REGISTER_BUTTON_XPATH = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[3]";

    public static final String DASHBOARD_LINK_XPATH = "xpath://*[@id='page-36']/div/div[1]/nav/ul/li[1]/a";

    public static final String INPUT_PASSWORD_LOGIN_XPATH = "xpath://*[@id='password']";

    public static final String MY_ORDERS_LINK_XPATH = "xpath://*[@id='page-36']/div/div[1]/nav/ul/li[2]/a";

    public static final String ORDERS_INF_XPATH = "xpath://*[@id='page-36']/div/div[1]/div";

    public static final String REGISTER_SUCCESS_MESSAGE_XPATH = "xpath://*[@id='page-36']/div/div[1]/div"; //utilizar metodo Assert para detectar mensaje, usar xpath donde sale el mensaje

    public static final String INPUT_USERNAME_XPATH = "xpath://*[@id='username']";
    public static final String INPUT_EMAIL_XPATH = "xpath://*[@id='reg_email']";
    public static final String INPUT_PASSWORD_REGISTER_XPATH = "xpath://*[@id='reg_password']";

    public static final String LOGIN_BUTTON = "xpath://*[@id='customer_login']/div[1]/form/p[3]/input[3]";
    public static final String REGISTER_BUTTON = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[3]";

    public static final String VIEW_BUTTON_XPATH = "xpath://*[@id='page-36']/div/div[1]/div/table/tbody/tr/td[5]/a";

    public static final String ORDER_DETAILS_XPATH = "xpath://*[@id='page-36']/div/div[1]/div";
    //*[@id="page-36"]/div/div[1]/div
    public static final String REGISTER_ERROR_MESSAGE_XPATH = "xpath://*[contains(text(), 'Please provide a valid email address')]";

    public static final String DASHBOARD_TEXT_XPATH = "xpath://*[@id='page-36']/div/div[1]/div/p[1]";

    public static final String ORDERS_DETAILS_MIN_XPATH = "xpath://*[@id='page-36']/div/div[1]/div/table";

    public static final String DASHBOARD_REGISTRATION_MESSAGE_XPATH = "xpath://*[contains(text(), 'From your account dashboard you can view your')]";


}

