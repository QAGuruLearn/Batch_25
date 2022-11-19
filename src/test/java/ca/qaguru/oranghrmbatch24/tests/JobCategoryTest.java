package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;

import ca.qaguru.oranghrmbatch24.pages.HeaderPage;
import ca.qaguru.oranghrmbatch24.pages.JobCategoriesPage;
import ca.qaguru.oranghrmbatch24.pages.LoginPage;
import ca.qaguru.oranghrmbatch24.pages.MenuOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JobCategoryTest extends TestBase {


    @Test(priority = 1)
    public void addNewJobCategory() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.JOB_CATEGORIES);
        JobCategoriesPage jobCategoriesPage = new JobCategoriesPage(driver);
        boolean newJobCategories = JobCategoriesPage.saveNewJobCategory("status");
        Assert.assertTrue(newJobCategories, "message displayed");
    }
@Test(priority = 2)
     public void editNewJobCategory() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("Admin", "admin123", true, null);
    HeaderPage headerPage = new HeaderPage(driver);
    headerPage.selectMenu(MenuOptions.JOB_CATEGORIES);
    JobCategoriesPage jobCategoriesPage = new JobCategoriesPage(driver);
    JobCategoriesPage.editNewJobCategory("status2");
}
@Test(priority = 3)
public void cancelDeleteNewJobCategory() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("Admin", "admin123", true, null);
    HeaderPage headerPage = new HeaderPage(driver);
    headerPage.selectMenu(MenuOptions.JOB_CATEGORIES);
    JobCategoriesPage jobCategoriesPage = new JobCategoriesPage(driver);
    JobCategoriesPage.cancelDeleteNewJobCategory();
}
@Test(priority =4)
public void deleteNewJobCategory() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("Admin", "admin123", true, null);
    HeaderPage headerPage = new HeaderPage(driver);
    headerPage.selectMenu(MenuOptions.JOB_CATEGORIES);
    JobCategoriesPage jobCategoriesPage = new JobCategoriesPage(driver);
    boolean deleteJobCategory = jobCategoriesPage.deleteNewJobCategory();
    Assert.assertTrue(deleteJobCategory, "tick box enabled");
}
@Test(priority =5)
    public void recordstatus() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.JOB_CATEGORIES);
        JobCategoriesPage jobCategoriesPage = new JobCategoriesPage(driver);
        String getStatus;
    getStatus = jobCategoriesPage.recordstatus();
    Assert.assertEquals("freelance", getStatus,"Status found for record");
    }



    }

