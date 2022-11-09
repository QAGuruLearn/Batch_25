package ca.qaguru.oranghrmbatch24.pages;
import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NationalitiesPage extends PageBase {
    private final String NationAddBtn ="//*[@type='button'] [@class='oxd-button oxd-button--medium oxd-button--secondary']";
    private final String EditNationButton="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[2]";
    private final String NationTextBoxField="(//*[@class='oxd-input oxd-input--active'])[2]";
    private final String SaveButton="//button[@type='submit']";
    private final String cancelButton="//*[@type='button'][@class='oxd-button oxd-button--medium oxd-button--ghost']";
    private final String DeleteNationButton="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[1]";
    private final String DeleteConfirmButton="//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
    private final String cancelDeleteNationButton="//*[@type='button'][@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']";
    private final String LogoutDropdownButton="//*[@class='oxd-userdropdown-name']";
    private final String LogoutButton="(//*[@role='menuitem'][@class='oxd-userdropdown-link'])[4]";
    private final String Banner="//*[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']";
   // private final String Outsidefield="//*[@class='oxd-layout-context']";
    public NationalitiesPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean saveNewNationality(String nationality)
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(NationAddBtn)));
        click(By.xpath(NationAddBtn));
        driver.findElement(By.xpath(NationTextBoxField)).sendKeys(nationality);
        click(By.xpath(SaveButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+dis);
        return dis;
    }
    public void cancelSaveNewNationality()
    {
        click(By.xpath(NationAddBtn));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(cancelButton)));
        click(By.xpath(cancelButton));
    }
    public boolean editExistingNationality(String nationality)
    {
        click(By.xpath(EditNationButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NationTextBoxField)));
        driver.findElement(By.xpath(NationTextBoxField)).clear();
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NationTextBoxField)));
        driver.findElement(By.xpath(NationTextBoxField)).sendKeys(nationality);
        click(By.xpath(SaveButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+dis);
        return dis;
       /*
        driver.findElement(By.xpath(Outsidefield)).sendKeys(Keys.TAB);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value = '';",driver.findElement(By.xpath(NationTxtLevel)));
        js.executeScript("arguments[0].value = '"+Bbbb+"';",driver.findElement(By.xpath(NationTxtLevel)));
        js.executeScript("arguments[0].click();" ,driver.findElement(By.xpath(EditSaveButton)));
       */
    }
    public void cancelEditExistingNationality()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(EditNationButton)));
        click(By.xpath(EditNationButton));
        click(By.xpath(cancelButton));
    }
    public boolean deleteExistingNationality()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(DeleteNationButton)));
        click(By.xpath(DeleteNationButton));
        click(By.xpath(DeleteConfirmButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+dis);
        return dis;
    }
    public void cancelDeleteExistingNationality()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(DeleteNationButton)));
        click(By.xpath(DeleteNationButton));
        click(By.xpath(cancelDeleteNationButton));
    }
    public void logout()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(LogoutDropdownButton)));
        click(By.xpath(LogoutDropdownButton));
        click(By.xpath(LogoutButton));
    }
}


