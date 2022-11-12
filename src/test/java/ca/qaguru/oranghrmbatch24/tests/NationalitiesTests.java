package ca.qaguru.oranghrmbatch24.tests;
import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.*;
import org.openqa.selenium.By;
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
        nationalitypage.addButtonVisibleClickable();
        nationalitypage.addTextBoxvisible();
        boolean banner=nationalitypage.saveNewNationality("AaaaSample");
        Assert.assertEquals(banner,true,"display banner not visible");
    }

    @Test(priority = 2)
    public void cancelAddNationality()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        headerPage.selectMenu(MenuOptions.NATIONALITIES);
        nationalitypage.cancelAddButtonVisibleClickable();
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
        nationalitypage.editButtonVisibleClickable();
        nationalitypage.editTextBoxvisible();
        boolean banner=nationalitypage.editExistingNationality("BbbbSample");
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
        nationalitypage.cancelEditButtonVisibleClickable();
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
        nationalitypage.deleteButtonVisibleClickable();
        nationalitypage.deleteConfirmButtonVisibleClickable();
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
        nationalitypage.cancelDeleteButtonVisibleClickable();
        nationalitypage.cancelDeleteExistingNationality();
    }

    @Test(priority = 7)
    public void LogoutAdmin()
    {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        nationalitypage = new NationalitiesPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        nationalitypage.logoutDropdownMenuVisibleClickable();
        nationalitypage.logout();
    }
}
