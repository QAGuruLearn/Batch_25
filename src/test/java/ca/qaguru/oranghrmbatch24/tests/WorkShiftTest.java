package ca.qaguru.oranghrmbatch24.tests;

import ca.qaguru.oranghrmbatch24.library.TestBase;
import ca.qaguru.oranghrmbatch24.pages.HeaderPage;
import ca.qaguru.oranghrmbatch24.pages.LoginPage;
import ca.qaguru.oranghrmbatch24.pages.MenuOptions;
import ca.qaguru.oranghrmbatch24.pages.WorkShift;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.UUID;

//import static jdk.internal.org.jline.terminal.MouseEvent.Modifier.Shift;


public class WorkShiftTest extends TestBase {
    @Test(priority = 1)
  public void addWorkShift() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.WORK_SHIFTS);

        WorkShift workshift = new WorkShift(driver);
        workshift.saveNewWorkShift("First shift","08:00 AM","01:00 PM","John");


        

    }

    @Test(priority = 2)

  public void EditWorkshift ()throws InterruptedException  {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.WORK_SHIFTS);

        WorkShift editshift = new WorkShift(driver);
        editshift.saveNewWorkShift("Second shift","01:00 PM","08:00 PM","Jamsheed");

    }





    @Test(priority = 3)

   public void DeleteWorkshift () throws InterruptedException {

           LoginPage loginPage = new LoginPage(driver);
            loginPage.login("admin", "admin123", true, null);
            HeaderPage headerPage = new HeaderPage(driver);
            headerPage.selectMenu(MenuOptions.WORK_SHIFTS);

            WorkShift deleteshift = new WorkShift(driver);
            deleteshift.DeleteWorkshift("Second shift");



    }


}






