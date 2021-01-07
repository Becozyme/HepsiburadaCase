import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class ProductDetail extends BaseTest {

    @Test

    public void Atahan() {


        TouchAction T = new TouchAction<>(ad);
        T.press(PointOption.point(509,1906))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(504,493)).release().perform();

        MobileElement el1 = ad.findElementById("com.pozitron.hepsiburada:id/dod_all");

        el1.click();
        MobileElement el2 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.ImageView");

        el2.click();

        T.press(PointOption.point(841, 872))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(275,836)).release().perform();

        TouchAction clk = new TouchAction<>(ad);
        clk.tap(new PointOption().withCoordinates(119,332)).perform();

        MobileElement el3 = ad.findElementByAccessibilityId("Sepete Ekle");
        el3.click();

        MobileElement el4 = ad.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Sepet\"]/android.widget.TextView");
        el4.click();


        Assert.assertEquals(ad.findElementById("9fd847bf-deb9-439b-97e3-9c3f4ec09689").getText(),"1 ürün");

    }
}
