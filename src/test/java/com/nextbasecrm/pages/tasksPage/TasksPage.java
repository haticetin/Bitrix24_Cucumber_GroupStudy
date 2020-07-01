package com.nextbasecrm.pages.tasksPage;

import com.nextbasecrm.pages.BasePage;
import org.openqa.selenium.WebElement;
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


}
