package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmploymentPage extends PageBase {

    private final String empAddBtn = "//button[text()=' Add ']";

    private final String empTxtLevel="(//*[@class='oxd-input oxd-input--active'])[2]";

    private final String empSaveBtn="//*['@type=submit'] [@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";

    private final String empEdtBtn="(//*['@type=button'] [@class='oxd-icon-button oxd-table-cell-action-space'])[2]";

    private final String empDltBtn="(//*['@type=button'] [@class='oxd-icon-button oxd-table-cell-action-space'])[13]";

    private final String empConBtn="//*['@type=button'] [@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";

    private final String cnlDltBtn="//*['@type=button'] [@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']";

    private final String susBnr="//div[@id='oxd-toaster_1']";

    private final String fstElm="//div[text()='Freelance']";

    private final String tckBox="//i[@class='oxd-icon bi-check2 oxd-toast-icon']";

    public EmploymentPage(WebDriver driver) { super(driver);}


    public boolean saveNewEmployment(String status) {
       WebDriverWait wait=new WebDriverWait(driver, 3000);
        click(By.xpath(empAddBtn));
        wait=new WebDriverWait(driver, 3000);
        driver.findElement(By.xpath(empTxtLevel)).sendKeys("status");
        click(By.xpath(empSaveBtn));
        wait=new WebDriverWait(driver, 3000);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(susBnr)));
        boolean add=driver.findElement(By.xpath(susBnr)).isDisplayed();
        System.out.println("message displayed");
        return add;
    }

    public void editNewEmployment(String status2)
    {
        WebDriverWait wait=new WebDriverWait(driver, 3000);
        click(By.xpath(empEdtBtn));
        wait=new WebDriverWait(driver, 3000);
        driver.findElement(By.xpath(empTxtLevel)).clear();
        driver.findElement(By.xpath(empTxtLevel)).sendKeys("status2");
        click(By.xpath(empSaveBtn));
    }

    public void cancelDeleteEmployment()
    {
        WebDriverWait wait=new WebDriverWait(driver, 3000);
        click(By.xpath(empDltBtn));
        click(By.xpath(cnlDltBtn));
    }


    public boolean deleteNewEmployment()
    {
        WebDriverWait wait=new WebDriverWait(driver, 3000);
        click(By.xpath(empDltBtn));
        click(By.xpath(empConBtn));
        new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(tckBox)));
        boolean delete=driver.findElement(By.xpath(tckBox)).isEnabled();
        System.out.println("tick box present");
        return delete;
    }

   public String recordStatus()
   {
       WebDriverWait wait=new WebDriverWait(driver, 3000);
    String getTxt=driver.findElement(By.xpath(fstElm)).getText();
       System.out.println("status found for record :" +getTxt);
    return getTxt;
   }
}
