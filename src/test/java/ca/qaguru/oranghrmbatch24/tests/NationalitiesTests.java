package ca.qaguru.oranghrmbatch24.tests;
import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NationalitiesTests extends TestBase
{
    LoginPage loginPage;
    HeaderPage headerPage;
    NationalitiesPage nationalitypage;
    @Test(priority = 1)
    public void addNewNationality() {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        boolean banner=nationalitypage.saveNewNationality("Aaaa NationalitySample");
        Assert.assertEquals(banner,true,"display banner");
    }

    @Test(priority = 2)
    public void cancelAddNationality()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        nationalitypage.cancelSaveNewNationality();
    }

    @Test(priority = 3)
    public void EditNationality()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        boolean banner=nationalitypage.editExistingNationality("Bbbb NationalitySample");
        Assert.assertEquals(banner,true,"display banner");
    }

    @Test(priority = 4)
    public void cancelEditNationality()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        nationalitypage.cancelEditExistingNationality();
    }

  @Test(priority = 5)
    public void DeleteNationality()
  {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        boolean banner=nationalitypage.deleteExistingNationality();
        Assert.assertEquals(banner,true,"display banner");
    }

    @Test(priority = 6)
    public void cancelDeleteNationality()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        nationalitypage.cancelDeleteExistingNationality();
    }

    @Test(priority = 7)
    public void LogoutAdmin()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        nationalitypage.logout();
        driver.close();
    }
}
