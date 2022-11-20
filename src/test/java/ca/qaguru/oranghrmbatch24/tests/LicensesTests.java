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
        String ExpectedTitle = "OrangeHRM";
        Assert.assertEquals(Title, ExpectedTitle, "Title Not Asserted");
    }


    @Test(priority = 1)
    public void addNewLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.saveNewLicenses("Google Cloud Professional");
        Assert.assertTrue(banner, "Add Green Save Banner not displayed");

    }

    @Test(priority = 2)
    public void editLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.editLicense("Certified Information Systems Security Professional (CISSP)");
        Assert.assertTrue(banner, "Edit Green Save Banner not displayed");


    }

    @Test(priority = 3)
    public void deleteLicenses() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LICENSES);
        LicensesPage licensesPage = new LicensesPage(driver);
        boolean banner = licensesPage.deleteLicense();
        Assert.assertTrue(banner, "Delete Green Save Banner not displayed");

    }


}





