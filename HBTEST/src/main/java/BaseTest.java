import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver<AndroidElement> ad ;

    @Before

    public void Setup () throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();


        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.pozitron.hepsiburada");
        dc.setCapability("appActivity","com.hepsiburada.ui.home.BottomNavigationActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<> (new URL("http://0.0.0.0:4723/wd/hub"),dc);

    }
    @AfterMethod
    public void teardown() {
        ad.quit();

}
}
