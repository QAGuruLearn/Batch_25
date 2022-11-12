package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;



public class LoginPage extends PageBase {
    private String nameUsername = "//input[@name='username']";
 private String namePassword = "//input[@name='password']";
    private String typeLogin = "//button[@type='submit']";
   private String textErrMsg = "//p[text()='Invalid credentials']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password, boolean validCredentials, String expErrMsg)  {
       setText(By.xpath(nameUsername),username);
        setText(By.xpath(namePassword),password);
       click(By.xpath(typeLogin));
       HeaderPage headerPage = new HeaderPage(driver);
        if(validCredentials){

            Assert.assertTrue(headerPage.isMenuVisible());
        }else {
            Assert.assertFalse(headerPage.isMenuVisible());
            Assert.assertEquals(getText(By.xpath(textErrMsg)),expErrMsg, "Incorrect Error Message");
        }
    }

}
