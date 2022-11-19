package ca.qaguru.oranghrmbatch24.pages;
import ca.qaguru.oranghrmbatch24.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;


public class JobCategoriesPage extends PageBase {
    private final String idBtnAdd = "btnAdd";
    private final String idBtnEdit = "btnEdit";
    private final String idTxtCategory = "JobCategories_JobCategory";
    private final String idBtnSave = "btnSave";
    private final String idBtnCancel = "btnCancel";
    private static final String buttonXpath = "\"//[@type='submit']\"";


    public JobCategoriesPage(WebDriver driver) {
        super(driver);
    }

    public static void cancelDeleteNewJobCategory() {
    }

    public static boolean saveNewJobCategory(String status) {
        return false;
    }

    public static void editNewJobCategory(String status2) {
    }

    public void saveNewJobCategories(String Category, String Notes) {
        click(By.id(idBtnAdd));
        setText(By.id(idTxtCategory), Category);
        click(By.id(idBtnSave));
        click(By.id(idBtnEdit));
        click(By.id(idBtnCancel));
    }

    public boolean deleteNewJobCategory() {
        return false;
    }

    public String recordstatus() {

        return null;
    }
}













































































































