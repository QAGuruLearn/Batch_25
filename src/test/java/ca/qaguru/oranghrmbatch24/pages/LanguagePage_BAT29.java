package ca.qaguru.oranghrmbatch24.pages;
import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
public class LanguagePage_BAT29 extends PageBase {
    private static final long WAIT_TIME=50L;
    private final long wait_time=300;
    private static final String LangAddButton = "//button[text()=' Add ']";
    private static final String LangTxtLevel="//div[contains(@class,'oxd-form-row')]//input[contains(@class, '--active')]";
    private final String LangDelBtn ="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[1]";
    private final String LangEditBtn ="(//*[@class='oxd-icon-button oxd-table-cell-action-space'])[2]";
    private final String LangTextBoxField="//div[@class='oxd-form-row']//descendant::input";
    private static final String DeleteConfirmButton="//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";
    private static final String LangSaveBtn="//button[@type='submit']";
    private static final String Banner="//*[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']";
    private static final String selectAllCheckBox="//div[@class='oxd-checkbox-wrapper']//span[contains(@class,'oxd-checkbox')][1]";
    private static final String deleteAllButton="//button[@type='button' and contains(@class,'--label-danger')]";
    private final String LogoutDropdownButton="//*[@class='oxd-userdropdown-name']";
    private final String LogoutButton="(//*[@role='menuitem'][@class='oxd-userdropdown-link'])[4]";
    public LanguagePage_BAT29(WebDriver driver) {super(driver);}
    public  void saveNewLanguage(String newLang) {
        click(By.xpath(LangAddButton));
        driver.findElement(By.xpath(LangTxtLevel)).sendKeys(newLang);
        click(By.xpath(LangSaveBtn));
    }
    public  boolean deleteLanguage(String delLanguage) {

        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(By.xpath(DeleteConfirmButton)));
        click(By.xpath(DeleteConfirmButton));
        new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean display_banner=driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :"+display_banner);

        return display_banner;
    }
    public void deleteButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(wait_time))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LangDelBtn)));
        Assert.assertTrue(isElementVisible(By.xpath(LangDelBtn)),"Delete button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(LangDelBtn)),"Delete button not clickable");
    }
    public void deleteConfirmButtonVisibleClickable()
    {
        click(By.xpath(LangDelBtn));
        Assert.assertTrue(isElementVisible(By.xpath(DeleteConfirmButton)),"Delete Confirm Button not visible");
    }

    public boolean editLanguage(String editLanguage) {
        new WebDriverWait(driver, Duration.ofSeconds(wait_time)).until(ExpectedConditions.elementToBeClickable(By.xpath(LangTxtLevel)));
        driver.findElement(By.xpath(LangTextBoxField)).click();
        driver.findElement(By.xpath(LangTextBoxField)).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(By.xpath(LangTextBoxField)).sendKeys(editLanguage);
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(By.xpath(LangSaveBtn)));
        click(By.xpath(LangSaveBtn));
        new WebDriverWait(driver, Duration.ofSeconds(wait_time)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean display_ban = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("green banner with SUCCESS message visible :" + display_ban);
        return display_ban;
    }
    public void editButtonVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(wait_time))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LangEditBtn)));
        Assert.assertTrue(isElementVisible(By.xpath(LangEditBtn)),"Edit button not visible");
        Assert.assertTrue(isElementClickable(By.xpath(LangEditBtn)),"Edit button not clickable");
    }
    public void editTextBox()
    {
        click(By.xpath(LangEditBtn));
        Assert.assertTrue(isElementVisible(By.xpath(LangTextBoxField)),"EditText box not visible");
    }
    public void clickDeleteAllCheckBox(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectAllCheckBox)));
        click(By.xpath(selectAllCheckBox));
    }
    public boolean deleteAllLanguage(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        click(By.xpath(deleteAllButton));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteAllButton)));
        return true;
    }
    public void clickDeleteConfirmationButton(){
        click(By.xpath(DeleteConfirmButton));
    }

    public void logoutDropdownMenuVisibleClickable()
    {
        new WebDriverWait(driver,Duration.ofSeconds(wait_time))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LogoutDropdownButton)));
        Assert.assertTrue(isElementVisible(By.xpath(LogoutDropdownButton)),"Logout Dropdown menu not visible");
        Assert.assertTrue(isElementClickable(By.xpath(LogoutDropdownButton)),"Logout Dropdown menu clickable");
    }
    public void logout()
    {
        click(By.xpath(LogoutDropdownButton));
        new WebDriverWait(driver,Duration.ofSeconds(WAIT_TIME))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(LogoutButton)));
        click(By.xpath(LogoutButton));
    }
}