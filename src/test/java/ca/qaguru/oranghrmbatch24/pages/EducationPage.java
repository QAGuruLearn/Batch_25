package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EducationPage extends PageBase {
    private final String eduAddBtn = "//button[text()=' Add ']";
    private final String eduTxtLevel="//div[contains(@class,'oxd-form-row')]//input[contains(@class, '--active')]";
    private final String eduSaveBtn="//button[@type='submit']";
    private final String getIdEduCancelBtn= "btnCancel";

    public EducationPage(WebDriver driver) {
        super(driver);
    }

    public void saveNewEducation(String level1) {
        click(By.xpath(eduAddBtn));
        setText(By.xpath(eduTxtLevel), level1);
        click(By.xpath(eduSaveBtn));
    }
}
