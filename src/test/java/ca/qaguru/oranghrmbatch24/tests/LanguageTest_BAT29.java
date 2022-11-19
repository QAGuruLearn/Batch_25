package ca.qaguru.oranghrmbatch24.tests;
import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.UUID;

public class LanguageTest_BAT29 extends TestBase {

    @BeforeMethod
    public void initialization(){
        init();
    }

    @Test(priority=0)
    public void addNewLanguage() {
        String uuid = UUID.randomUUID().toString();
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        languagePage.saveNewLanguage ("LanguageMain"+uuid);
    }

    @Test(priority=1)
    public void editExistingLanguage()
    {
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        languagePage.editButtonVisibleClickable();
        languagePage.editTextBox();
        boolean banner=languagePage.editLanguage("Edited_Language");
        Assert.assertEquals(banner,true,"display banner");
    }
    @Test(priority=2)
    public void deleteLanguage(){
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        languagePage.deleteButtonVisibleClickable();
        languagePage.deleteConfirmButtonVisibleClickable();
        boolean banner= languagePage.deleteLanguage("Arabic");
        Assert.assertEquals(banner,true,"display banner");
    }

    @Test(priority=4)
    public void addMultipleLanguage() {
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        String uuid=null;
        for(int i=1; i<=3;i++){
            uuid = UUID.randomUUID().toString();
            languagePage.saveNewLanguage("Language"+uuid);
        }
    }
    @Test(priority=5)
    public void deleteAll(){
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        languagePage.clickDeleteAllCheckBox();
        boolean banner= languagePage.deleteAllLanguage();
        languagePage.clickDeleteConfirmationButton();
        Assert.assertEquals(banner,true,"Attempt Failed");
    }
    public void init(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LANGUAGES);
    }

    @AfterMethod
    public void quit(){
        LanguagePage_BAT29 languagePage = new LanguagePage_BAT29(driver);
        languagePage.logoutDropdownMenuVisibleClickable();
        languagePage.logout();
        }
    }

