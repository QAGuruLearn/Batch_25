package ca.qaguru.oranghrmbatch24.library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public abstract class TestBase
{
    protected WebDriver driver;
    protected String browser;
    protected final String BASE_URL = "https://opensource-demo.orangehrmlive.com";
    @BeforeSuite
    public void beforeSuite()
    {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }
    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(@Optional("chrome") String browser)
    {
        this.browser = browser;
        System.out.println("Browser : " + browser);
        getDriver();
    }

    private void getDriver()
    {
        switch (browser.toLowerCase())
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        String actual_title=driver.getTitle();
        Assert.assertEquals(actual_title,"OrangeHRM");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
   @AfterMethod
    public void afterMethod(){
        driver.quit();
    }


}
