import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver androidDriver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("platformVersion", "14");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.continuum.emi.calculator");
        desiredCapabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        desiredCapabilities.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/emi-calc.apk");

        URL url = new URL("http://127.0.0.1:4723");
        androidDriver = new AndroidDriver(url, desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return androidDriver;
    }

    @AfterTest
    public void closeApp() {
        androidDriver.quit();
    }
}
