package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VacancyPage extends PageBase {

 String recruitment = "//a[@class='oxd-main-menu-item active']";
 String vacancies = "//a[text()='Vacancies']";

 String arrow1 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]";

 String object = "//div[text()='Account Assistant']";

 String arrow2 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]";

 String arrow3 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]";

 String arrow4 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]";

 String search = "//button[@type='submit']";
 String Reset = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']";

 String Add = "(//button[@type='button'])[4]";

 String arrow5 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]";
 String object6 = "//div[text()='Account Assistant']";
 String save = "//button[contains(@type,'submit')]";
 String cancel = "(//button[contains(@type,'button')])[2]";

 String edit = "(//button[@type='button'])[6]";
 String delete = "(//button[@type='button'])[5]";
 //String click= ("(// i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");

 String click= "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span";

 public VacancyPage(WebDriver driver) {
  super(driver);
 }

 public void saveN()  {

  click(By.xpath(recruitment));
  click(By.xpath(vacancies));
  click(By.xpath(arrow1));
  click(By.xpath(arrow2));
  click(By.xpath(object));
  click(By.xpath(arrow3));
  click(By.xpath(arrow4));
  click(By.xpath(search));
  click(By.xpath(Reset));



 }

 public void saveN1()  {
  click(By.xpath(Add));
  setText(By.xpath("(//input[contains(@class,'oxd-input ')])[2]"), "Software engineer");
  click(By.xpath(arrow5));
  click(By.xpath(object6));
  setText(By.xpath(("//textarea[@placeholder='Type description here']")), "All can apply");

  setText(By.xpath(("//input[contains(@placeholder,'Type for hints')]")), " Odis Adalwin ");
  //setText(By.xpath("(// input[@class='oxd-input oxd-input--active'])[3]"), " 6");
  setText(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input"),"6");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(save)));
  Assert.assertTrue(isElementVisible(By.xpath(save)),"It can save");
  Assert.assertTrue(isElementClickable(By.xpath(save)),"It cannot save");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cancel)));
  Assert.assertTrue(isElementVisible(By.xpath(cancel)),"can cancel");
  Assert.assertTrue(isElementClickable(By.xpath(cancel)),"cannot cancel");


 }


 public void saveN2()  {
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(edit)));
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(arrow5)));
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(object6)));
  setText(By.xpath(("//textarea[@placeholder='Type description here']")), "All can apply");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(save)));
  Assert.assertTrue(isElementVisible(By.xpath(save)),"It can save");
  Assert.assertTrue(isElementClickable(By.xpath(save)),"It cannot save");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cancel)));
  Assert.assertTrue(isElementVisible(By.xpath(cancel)),"can cancel");
  Assert.assertTrue(isElementClickable(By.xpath(cancel)),"cannot cancel");

 }

 public void saveN3()  {
  new WebDriverWait(driver,Duration.ofSeconds(200))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(delete)));
  Assert.assertTrue(isElementVisible(By.xpath(delete)),"It is working");
  Assert.assertTrue(isElementClickable(By.xpath(delete)),"It is not working");
 }
 public void saveN4()  {
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(click)));
  Assert.assertTrue(isElementVisible(By.xpath(click)),"It is clickable");
  Assert.assertTrue(isElementClickable(By.xpath(click)),"It is not clickable");
 }

}



















