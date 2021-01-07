import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends  BaseTest {

    @Test

    public void Burhan() {

        MobileElement el1 = ad.findElementById("com.pozitron.hepsiburada:id/account_icon");
        el1.click();
        MobileElement el2 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        el2.click();
        MobileElement el3 = ad.findElementById("com.pozitron.hepsiburada:id/etLoginEmail");
        el3.click();
        el3.sendKeys("burhanatahan647@gmail.com");
        MobileElement el4 = ad.findElementById("com.pozitron.hepsiburada:id/etLoginPassword");
        el4.click();
        MobileElement el5 = ad.findElementById("com.pozitron.hepsiburada:id/etLoginPassword");
        el5.click();
        el5.sendKeys("Bur1han2");
        MobileElement el6 = ad.findElementById("com.pozitron.hepsiburada:id/btnLoginLogin");
        el6.click();
        MobileElement el7 = ad.findElementById("android:id/button1");
        el7.click();
        MobileElement el8 = ad.findElementById("com.pozitron.hepsiburada:id/tvUserAccountUsername");
        el8.click();
        MobileElement el9 = ad.findElementById("com.pozitron.hepsiburada:id/etUserFirstName");
        el9.click();
        el9.clear();
        el9.sendKeys("Bugi95");

        TouchAction T = new TouchAction<>(ad);
        T.press(PointOption.point(488, 1148))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(481, 399)).release().perform();


        MobileElement el10 = ad.findElementById("com.pozitron.hepsiburada:id/btnOkSend");
        el10.click();
        MobileElement el11 = ad.findElementById("android:id/button1");
        el11.click();
        MobileElement el12 = ad.findElementByAccessibilityId("navigationItem_0");
        el12.click();
        MobileElement el13 = ad.findElementById("com.pozitron.hepsiburada:id/account_icon");
        el13.click();


        Assert.assertEquals(ad.findElementById("com.pozitron.hepsiburada:id/tvUserAccountUsername").getText(), "Bugi95");
    }
}


