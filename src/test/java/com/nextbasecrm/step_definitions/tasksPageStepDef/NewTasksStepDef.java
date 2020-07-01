package com.nextbasecrm.step_definitions.tasksPageStepDef;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import com.nextbasecrm.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.awt.dnd.DragGestureEvent;
import java.util.List;

public class NewTasksStepDef {

    Pages pages = new Pages();

    @When("the user create a new task following credentials: {}")
    public void theUserCreateANewTaskFollowingCredentials(String taskData) {
        List<String> enterTaskData = BrowserUtils.getCommaList(taskData);
        pages.tasksPage().newTaskButton.click();
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("[class='side-panel-iframe']")));
        pages.tasksPage().meetingNameInput.sendKeys(enterTaskData.get(0));
        //Driver.get().switchTo().defaultContent();
        //Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("[class='bx-editor-iframe']")));
       // pages.tasksPage().descriptionInput.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.setAttribute(pages.tasksPage().descriptionInput,"value",enterTaskData.get(1));
        BrowserUtils.waitFor(2);
        ///pages.tasksPage().descriptionInput.sendKeys(enterTaskData.get(1));
        //Driver.get().switchTo().defaultContent();
       // Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("[class='side-panel-iframe']")));

       // pages.tasksPage().dateInput.click();
       // pages.tasksPage().dateInput.sendKeys(enterTaskData.get(2));
        BrowserUtils.setAttribute(pages.tasksPage().dateInput,"value",enterTaskData.get(2));
        BrowserUtils.waitFor(2);
        pages.tasksPage().addButton.click();
        Driver.get().switchTo().defaultContent();

    }

    @Then("verify the task on the page with has following credentials: meeting name, description, dead line")
    public void verifyTheTaskOnThePageWithHasFollowingCredentialsMeetingNameDescriptionDeadLine() {
    }
}
