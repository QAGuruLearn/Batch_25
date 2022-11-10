package ca.qaguru.oranghrmbatch24.pages;
import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class NationalitiesPage extends PageBase {
    private final String NationAddBtn ="//*[@type='button'] [@class='oxd-button oxd-button--medium oxd-button--secondary']";
    private final String EditNationButton="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[2]";
    private final String NationTextBoxField="(//*[@class='oxd-input oxd-input--active'])[2]";
    private final String SaveButton="//button[@type='submit']";
    private final String CancelButton="//*[@type='button'][@class='oxd-button oxd-button--medium oxd-button--ghost']";
    private final String DeleteNationButton="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[1]";
    private final String DeleteConfirmButton="//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
    private final String CancelDeleteNationButton="//*[@type='button'][@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']";
    private final String LogoutDropdownButton="//*[@class='oxd-userdropdown-name']";
    private final String LogoutButton="(//*[@role='menuitem'][@class='oxd-userdropdown-link'])[4]";
    private final String Banner="//*[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']";
    public NationalitiesPage(WebDriver driver)
    {
        super(driver);
    }



    public boolean saveNewNationality(String nationality)
    {
        driver.findElement(By.xpath(NationTextBoxField)).sendKeys(nationality);
        click(By.xpath(SaveButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+dis);
        return dis;
    }
    public void AddButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NationAddBtn)));
        Assert.assertTrue(isElementVisible(By.xpath(NationAddBtn)),"Add button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(NationAddBtn)),"Add button not clickable");
    }
    public void addTextBoxvisible()
    {
        click(By.xpath(NationAddBtn));
        Assert.assertTrue(isElementVisible(By.xpath(NationTextBoxField)),"AddText box not visible");
    }
    public void cancelSaveNewNationality()
    {

        click(By.xpath(CancelButton));
    }
    public void cancelAddButtonVisibleClickable()
    {
        click(By.xpath(NationAddBtn));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CancelButton)));
        Assert.assertTrue(isElementVisible(By.xpath(CancelButton)),"Cancel button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(CancelButton)),"Cancel button not clickable");
    }
    public void editButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditNationButton)));
        Assert.assertTrue(isElementVisible(By.xpath(EditNationButton)),"Edit button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(EditNationButton)),"Edit button not clickable");

    }
    public void editTextBoxvisible()
    {
        click(By.xpath(EditNationButton));
        Assert.assertTrue(isElementVisible(By.xpath(NationTextBoxField)),"EditText box not visible");
    }
    public boolean editExistingNationality(String nationality)
    {
        driver.findElement(By.xpath(NationTextBoxField)).clear();
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
        click(By.xpath(CancelButton));
    }
    public void cancelEditButtonVisibleClickable()
    {
        click(By.xpath(EditNationButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CancelButton)));
        Assert.assertTrue(isElementVisible(By.xpath(CancelButton)),"Cancel button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(CancelButton)),"Cancel button not clickable");

    }
    public void deleteButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DeleteNationButton)));
        Assert.assertTrue(isElementVisible(By.xpath(DeleteNationButton)),"Delete button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(DeleteNationButton)),"Delete button not clickable");
    }
    public void deleteConfirmButtonVisibleClickable()
    {
        click(By.xpath(DeleteNationButton));
        Assert.assertTrue(isElementVisible(By.xpath(DeleteConfirmButton)),"Delete Confirm Button not visible");
    }

    public boolean deleteExistingNationality()
    {
        click(By.xpath(DeleteConfirmButton));
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+dis);
        return dis;
    }
    public void cancelDeleteExistingNationality()
    {
        click(By.xpath(CancelDeleteNationButton));
    }
    public void cancelDeleteButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(DeleteNationButton)));
        click(By.xpath(DeleteNationButton));
        Assert.assertTrue(isElementVisible(By.xpath(CancelDeleteNationButton)),"Cancel Button not visible");
    }
    public void logoutDropdownMenuVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LogoutDropdownButton)));
        Assert.assertTrue(isElementVisible(By.xpath(LogoutDropdownButton)),"Logout Dropdown menu not visible");
        Assert.assertTrue(isElementClickable(By.xpath(LogoutDropdownButton)),"Logout Dropdown menu clickable");
    }
    public void logout()
    {
        click(By.xpath(LogoutDropdownButton));
        click(By.xpath(LogoutButton));
    }
}


