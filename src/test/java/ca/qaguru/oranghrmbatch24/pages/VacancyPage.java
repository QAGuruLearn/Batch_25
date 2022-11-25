package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VacancyPage extends PageBase {

 String recruitmentBtn = "//a[@class='oxd-main-menu-item active']";
 String vacanciesBtn = "//a[text()='Vacancies']";

 String jobTitleDropDown = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]";

 String jobTitleDropDownValue = "//div[text()='Account Assistant']";

 String vacancyDropDown = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]";

 String hiringManagerDropDown = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]";

 String statusDropDown = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]";

 String searchBtn = "//button[@type='submit']";
 String resetBtn = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']";

 String addBtn = "(//button[@type='button'])[4]";

 String jobTitleDropDown1 = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]";
 String jobTitleDropDownValue1 = "//div[text()='Account Assistant']";
 String saveBtn = "//button[contains(@type,'submit')]";
 String cancelBtn = "(//button[contains(@type,'button')])[2]";

 String editBtn = "(//button[@type='button'])[6]";
 String deleteBtn = "(//button[@type='button'])[5]";
 String checkBoxClick= "// div[@class='oxd-checkbox-wrapper']";

 public VacancyPage(WebDriver driver) {
  super(driver);
 }

 public void searchVAcancyAndRESET()  {

  click(By.xpath(recruitmentBtn));
  click(By.xpath(vacanciesBtn));
  click(By.xpath(jobTitleDropDown));
  click(By.xpath(vacancyDropDown));
  click(By.xpath(jobTitleDropDownValue));
  click(By.xpath(hiringManagerDropDown));
  click(By.xpath(statusDropDown));
  click(By.xpath(searchBtn));
  click(By.xpath(resetBtn));

 }

 public void addVacancySaveAndCancel()  {
  click(By.xpath(addBtn));
  setText(By.xpath("(//input[contains(@class,'oxd-input ')])[2]"), "Software engineer");
  click(By.xpath(jobTitleDropDown1));
  click(By.xpath(jobTitleDropDownValue1));
  setText(By.xpath(("//textarea[@placeholder='Type description here']")), "All can apply");

  setText(By.xpath(("//input[contains(@placeholder,'Type for hints')]")), " Odis Adalwin ");
  setText(By.xpath("(// input[@class='oxd-input oxd-input--active'])[3]"), " 6");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveBtn)));
  Assert.assertTrue(isElementVisible(By.xpath(saveBtn)),"saveBtn not visible");
  Assert.assertTrue(isElementClickable(By.xpath(saveBtn)),"saveBtn not clickable");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cancelBtn)));
  Assert.assertTrue(isElementVisible(By.xpath(cancelBtn)),"cancelBtn not visible");
  Assert.assertTrue(isElementClickable(By.xpath(cancelBtn)),"cancelBtn not clickable");


 }


 public void editVacancyAndVerifySaveAndDelete()  {
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editBtn)));
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(jobTitleDropDown1)));
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(jobTitleDropDownValue1)));
  setText(By.xpath(("//textarea[@placeholder='Type description here']")), "All can apply");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveBtn)));
  Assert.assertTrue(isElementVisible(By.xpath(saveBtn)),"saveBtn not visible");
  Assert.assertTrue(isElementClickable(By.xpath(saveBtn)),"saveBtn not clickable");
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cancelBtn)));
  Assert.assertTrue(isElementVisible(By.xpath(cancelBtn)),"cancelBtn not visible");
  Assert.assertTrue(isElementClickable(By.xpath(cancelBtn))," cancelBtn not clickable");

 }

 public void deleteButtonVisible()  {
  new WebDriverWait(driver,Duration.ofSeconds(200))
          .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteBtn)));
  Assert.assertTrue(isElementVisible(By.xpath(deleteBtn)),"deleteBtn not visible");
  Assert.assertTrue(isElementClickable(By.xpath(deleteBtn)),"deleteBtn not clickable");
 }
 public void CheckBoxClick()  {
  new WebDriverWait(driver,Duration.ofSeconds(20))
          .until(ExpectedConditions.presenceOfElementLocated(By.xpath(checkBoxClick)));
  Assert.assertTrue(isElementVisible(By.xpath(checkBoxClick)),"checkBoxClick not visible");
  Assert.assertTrue(isElementClickable(By.xpath(checkBoxClick)),"checkBoxClick not clickable");
 }
}



















