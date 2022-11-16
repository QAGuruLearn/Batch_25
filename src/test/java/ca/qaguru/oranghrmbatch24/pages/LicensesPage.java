package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LicensesPage extends PageBase {

    private final String LicAddBtn = "//*[contains(@class,'secondary')]";

    private final String LicTextName = "(//*[contains(@class,'input')])[5]";

    private final String LicSaveBtn = "//button[@type='submit']";
    private final String Banner = "//*[@id=\"oxd-toaster_1\"]/div";

    private final String LicEditSaveBtn = "//button[@type='submit']";

    private final String LicPenBtn = "(//*[contains(@class,'button')])[13]";

    private final String LicEditNameBtn = "(//*[contains(@class,'input')])[5]";

    private final String LicDeleteBtn = "(//*[contains(@class,'button')])[12]";

    private final String LicDeleteYesBtn = "(//*[@type='button'])[18]";


    public LicensesPage(WebDriver driver) {
        super(driver);
    }

    public boolean saveNewLicenses(String LicName) {
        click(By.xpath(LicAddBtn));
        setText(By.xpath(LicTextName), LicName);
        click(By.xpath(LicSaveBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;


    }

    public boolean editLicense(String LicName1) {
        click(By.xpath(LicPenBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(LicEditSaveBtn)));
        driver.findElement(By.xpath(LicEditNameBtn)).sendKeys(LicName1);
        click(By.xpath(LicEditSaveBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }


    public boolean deleteLicense() {

        click(By.xpath(LicDeleteBtn));
        click(By.xpath(LicDeleteYesBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }


}