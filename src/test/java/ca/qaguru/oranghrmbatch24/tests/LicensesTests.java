package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.HeaderPage;
import ca.qaguru.oranghrmbatch24.pages.LicensesPage;
import ca.qaguru.oranghrmbatch24.pages.LoginPage;
import ca.qaguru.oranghrmbatch24.pages.MenuOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LicensesTests extends TestBase {

    @Test(priority = 0)
    public void assertTitle() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        String Title = driver.getTitle();
        String ExpectedTitle = driver.getTitle();
        if (Title.equals(ExpectedTitle)) {
            System.out.println("Successfully Logged in");
        } else {
            System.out.println("Unsuccessful Logged in");
        }
    }


    @Test(priority = 1)
    public void addNewLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.SaveNewLicenses("Google Cloud Professional");
        Assert.assertEquals(banner, true, "Add Green Save Banner displayed");

    }

    @Test(priority = 2)
    public void editLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.EditLicense("Certified Information Systems Security Professional (CISSP)");
        Assert.assertEquals(banner, true, "Edit Green Save Banner displayed");


    }

    @Test(priority = 3)
    public void deleteLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.DeleteLicense();
        Assert.assertEquals(banner, true, "Delete Green Save Banner displayed");

    }


}





