package uk.abdoul.co.fitit;

import android.content.res.Resources;

/**
 * Created by Loisg on 10/11/2017 at 12:25.
 */

public class Utils {

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
    //Email Validation pattern
    public static final String regEx = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";

    //Fragments Tags
    public static final String Login_Fragment = "Login_Fragment";
    public static final String SignUp_Fragment = "SignUp_Fragment";
    public static final String ForgotPassword_Fragment = "ForgotPassword_Fragment";
    public static final String welcome = "welcome";

    public static final String Home_Fragment = "Home_Fragment";
    public static final String ComposeMessage_Fragment = "ComposeMessage_Fragment";
    public static final String Profile_Fragment = "Profile_Fragment";
    public static final String Units_Fragment = "Units_Fragment";
    public static final String Units_Upload_Fragment = "Units_Upload_Fragment";
    public static final String Buy_Units_Fragment = "Buy_Units_Fragment";
    public static final String Units_Price_Fragment = "Units_Price_Fragment";
    public static final String Web_Page_Fragment = "Web_Page_Fragment";
    public static final String Contact_Fragment = "Contact_Fragment";
    public static final String Contact_Home_Fragment = "Contact_Home_Fragment";
    public static final String Reseller_Fragment = "Reseller_Fragment";
    public static final String Api_Fragment = "Api_Fragment";
    public static final String About_Fragment = "About_Fragment";
    public static final String Notification_Fragment = "Notification_Fragment";
    public static final String Product_Fragment = "Product_Fragment";

}
