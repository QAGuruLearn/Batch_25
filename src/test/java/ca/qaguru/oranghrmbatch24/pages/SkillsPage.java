package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SkillsPage extends PageBase {

    private final String SkillAddBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button";
    private final String SkillsName ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
    private final String SkillSaveBtn ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
    private final String Banner = "//*[@id=\"oxd-toaster_1\"]/div";
    private final String SkillEditBtn = "(//*[contains(@class,'button')])[13]";
    private final String SkillNameBtn ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
    private final String SkillEditSaveBtn ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
    private final String SkillDeleteBtn =  "(//*[contains(@class,'button')])[12]";
    private final String SkillDeleteYBtn =  "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]";
    public SkillsPage(WebDriver driver) {
        super(driver);
    }

    public boolean AddNewSkill(String SkillName) {
        click(By.xpath(SkillAddBtn));
        setText(By.xpath(SkillsName),"test");
        click(By.xpath(SkillSaveBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Banner)));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }

    public boolean editSkills(String SkillName1) {
        click(By.xpath(SkillEditBtn));
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(SkillEditSaveBtn)));
        driver.findElement(By.xpath(SkillNameBtn)).sendKeys(SkillName1);
        click(By.xpath(SkillEditSaveBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }

    public boolean deleteSkills() {

        click(By.xpath(SkillDeleteBtn));
        click(By.xpath(SkillDeleteYBtn));
        boolean dis = driver.findElement(By.xpath(Banner)).isDisplayed();
        System.out.println("Green banner with Success message displayed: " + dis);
        return dis;

    }

}

