package com.nextbasecrm.pages.tasksPage;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(id ="tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy(css="[placeholder='Things to do']")
    public WebElement meetingNameInput;

    @FindBy(id="bxed_bitrix_tasks_task_default_1")
    public WebElement descriptionInput;

    @FindBy(xpath = "//input[@data-bx-id='datepicker-display']")
    public WebElement dateInput;

    @FindBy(css="[data-bx-id='task-edit-submit'] span")
    public WebElement addButton;

    @FindBy (xpath = "//span[@class='bx-calendar-button-text'][contains(text(),'Select')]")
    public WebElement selectDateButton;

    @FindBy (xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement monthSelect;

    @FindBy (xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement yearSelect;





    public void selectMonthInDropDown(String month){
        monthSelect.click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//div[@class='bx-calendar-month-content']//span[contains(text(),'"+month+"')]")).click();
    }

    public void selectYearInDropDown(String year){
        yearSelect.click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//div[@class='bx-calendar-year-content']//span[contains(text(),'"+year+"')]")).click();
    }

    public void selectDayOnTable (String day){
        Driver.get().findElement(By.xpath("//div[@class='bx-calendar-range']//a[.='"+day+"']")).click();
    }



}
