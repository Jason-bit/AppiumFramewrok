package messages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.net.URL;
import java.util.List;


public class TestMessages {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Samsung");    
        driver = new RemoteWebDriver(new URL("http://172.28.57.49:4723/wd/hub"), capabilities);      
    }


    @Test
    public void testMessages(){ 
    	
 
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }


}

