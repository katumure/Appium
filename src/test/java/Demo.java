import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Demo {
    public static AppiumDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:/Users/manjunatha.katumure/Calculator.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AppiumDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
        Thread.sleep(1000);
        System.out.println(sessionId);
        driver.findElement(By.id("uz.pdp.calculator2:id/eight")).click();
        driver.findElement(By.id("uz.pdp.calculator2:id/plus")).click();
        driver.findElement(By.id("uz.pdp.calculator2:id/two")).click();
        driver.findElement(By.id("uz.pdp.calculator2:id/equality")).click();
        driver.findElement(By.id("uz.pdp.calculator2:id/clear")).click();
    }
}
