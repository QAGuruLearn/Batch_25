

package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkillsTest extends TestBase {



    @Test(priority = 1)
    public void addNewSkill() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.SKILLS);
        SkillsPage SkillsPage = new SkillsPage(driver);
        boolean banner = SkillsPage.AddNewSkill ("Google Cloud Professional");
        Assert.assertTrue(banner, "Add Green Save Banner not displayed");

    }



    @Test(priority = 2)
    public void editSkills() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.SKILLS);
        SkillsPage SkillsPage = new SkillsPage(driver);
        boolean banner = SkillsPage.editSkills("C#");
        Assert.assertTrue(banner, "Edit Green Save Banner not displayed");




    }

    @Test(priority = 3)
    public void deleteSkills() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.SKILLS);
        SkillsPage SkillsPage = new SkillsPage(driver);
        boolean banner = SkillsPage.deleteSkills();
        Assert.assertTrue(banner, "Delete Green Save Banner not displayed");

    }



}













