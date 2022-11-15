package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LicensesPage extends PageBase {

    private final String LicAddBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button";
    private final String LicTextName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
    private final String LicSaveBtn = "//button[@type='submit']";
    private final String Banner = "//*[@id=\"oxd-toaster_1\"]/div";

    private final String LicEditSaveBtn = "//button[@type='submit']";

    private final String LicPenBtn = "(//*[@class='oxd-icon-button oxd-table-cell-action-space'][@type='button'])[10]";

    private final String LicEditNameBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";

    private final String LicDeleteBtn = "(//*[@class='oxd-icon-button oxd-table-cell-action-space'][@type='button'])[9]";

    private final String LicDeleteYesBtn = "(//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin'][@type='button'])";

    private final String getIdLicCancelBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]";

    public LicensesPage(WebDriver driver) {
        super(driver);
    }

    public boolean SaveNewLicenses(String LicName) {
        click(By.xpath(LicAddBtn));
        setText(By.xpath(LicTextName), LicName);
        click(By.xpath(LicSaveBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;


    }

    public boolean EditLicense(String LicName1) {
        click(By.xpath(LicPenBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(LicEditSaveBtn)));
        driver.findElement(By.xpath(LicEditNameBtn)).sendKeys(LicName1);
        click(By.xpath(LicEditSaveBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }


    public boolean DeleteLicense() {

        click(By.xpath(LicDeleteBtn));
        click(By.xpath(LicDeleteYesBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }


}