package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.*;

import org.testng.annotations.Test;

public class VacancyTest extends TestBase {
       @Test (priority = 1)
    public void Recruitment()  {
           LoginPage loginPage = new LoginPage(driver);
           loginPage.login("Admin", "admin123", true, null);
           HeaderPage headerPage = new HeaderPage(driver);
           headerPage.selectMenu(MenuOptions.VACANCIES);
           VacancyPage vacancyPage=new VacancyPage(driver);
           vacancyPage.saveN();

       }
        @Test(priority = 2)
       public void Addition() {
           LoginPage loginPage = new LoginPage(driver);
           loginPage.login("Admin", "admin123", true, null);
           HeaderPage headerPage = new HeaderPage(driver);
           headerPage.selectMenu(MenuOptions.VACANCIES);
           VacancyPage vacancyPage=new VacancyPage(driver);
           vacancyPage.saveN1();

       }
    @Test(priority = 3)
    public void Edit()  {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.VACANCIES);
        VacancyPage vacancyPage = new VacancyPage(driver);
        vacancyPage.saveN2();
    }

    @Test(priority = 4)
    public void delete() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.VACANCIES);
        VacancyPage vacancyPage = new VacancyPage(driver);
        vacancyPage.saveN3();
    }
    @Test(priority = 5)
    public void click()  {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.VACANCIES);
        VacancyPage vacancyPage = new VacancyPage(driver);
        vacancyPage.saveN4();
    }












    }

















