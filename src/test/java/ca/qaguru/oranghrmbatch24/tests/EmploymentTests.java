package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.EmploymentPage;
import ca.qaguru.oranghrmbatch24.pages.HeaderPage;
import ca.qaguru.oranghrmbatch24.pages.LoginPage;
import ca.qaguru.oranghrmbatch24.pages.MenuOptions;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmploymentTests extends TestBase {

    @Test (priority = 1)
    public void addNewEmployment() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123",true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.EMPLOYMENT_STATUS);
        EmploymentPage employmentPage = new EmploymentPage(driver);
        boolean newEmployee= employmentPage.saveNewEmployment("status");
        Assert.assertTrue(newEmployee, "message displayed");
    }

    @Test (priority = 2)
    public void editNewEmployment() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123",true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.EMPLOYMENT_STATUS);
        EmploymentPage employmentPage = new EmploymentPage(driver);
        employmentPage.editNewEmployment("status2");
    }

    @Test (priority = 3)
    public void cancelDeleteEmployment() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123",true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.EMPLOYMENT_STATUS);
        EmploymentPage employmentPage = new EmploymentPage(driver);
        employmentPage.cancelDeleteEmployment();

    }
    @Test (priority = 4)
    public void deleteNewEmployment() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123",true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.EMPLOYMENT_STATUS);
        EmploymentPage employmentPage = new EmploymentPage(driver);
        boolean deleteEmployee= employmentPage.deleteNewEmployment();
        Assert.assertTrue(deleteEmployee, "tick box enabled");
    }
    @Test (priority = 5)
    public void recordStatus() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123",true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.EMPLOYMENT_STATUS);
        EmploymentPage employmentPage = new EmploymentPage(driver);
        String getStatus= employmentPage.recordStatus();
        Assert.assertEquals("Freelance", getStatus, "status found for record");
    }
}
