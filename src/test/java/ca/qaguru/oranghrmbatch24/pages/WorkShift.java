package ca.qaguru.oranghrmbatch24.pages;

import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WorkShift extends PageBase {

    public Object saveNewWorkShift;

    public WorkShift(WebDriver driver) {
        super(driver);
    }

    private final String WSAddBtn = "//*[@type='button'][@class='oxd-button oxd-button--medium oxd-button--secondary']";
    private final String WSTxtLevel = "//*[@class='oxd-input oxd-input--active']";
    private final String WhfromText ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input";
    private final String WhtoText ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input";
    private final String WSEmployee ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input";
    private final String WSSaveBtn= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]";
    private final String FSText ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input";

    private final String WSeditBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]/i";
    private final String WSdeleteBtn = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[6]/div/button[1]/i";
    private final String deleteconfirmBtn ="//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]";





    public void saveNewWorkShift(String workshift,String From,String To,String Employeename) {
        sleep(5000);
        click(By.xpath(WSAddBtn));
        setText(By.xpath(WSTxtLevel), workshift);

        sleep(4000);
        click(By.xpath(WhfromText));
        setText(By.xpath(WhfromText),From);




        click(By.xpath(WhtoText));
       setText(By.xpath(WhtoText),To);




        click(By.xpath(WSEmployee));
        setText(By.xpath(WSEmployee),Employeename);


        sleep(5000);
        click(By.xpath(WSSaveBtn));




    }



    public void EditExistingWorkShift(String saveNewWorkShift,String From,String To,String Employeename){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        sleep(4000);
        click(By.xpath(FSText));
        setText(By.xpath(WSTxtLevel), saveNewWorkShift);

        sleep(4000);
        click(By.xpath(WhfromText));
        setText(By.xpath(WhfromText),From);

        click(By.xpath(WhtoText));
        setText(By.xpath(WhtoText),To);

        click(By.xpath(WSEmployee));
        setText(By.xpath(WSEmployee),Employeename);

        sleep(5000);
        click(By.xpath(WSSaveBtn));




    }

    public void DeleteWorkshift(String deleteWSBtn){
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
        sleep(5000);
        click(By.xpath(WSdeleteBtn));
        click(By.xpath(deleteconfirmBtn));


    }

}
