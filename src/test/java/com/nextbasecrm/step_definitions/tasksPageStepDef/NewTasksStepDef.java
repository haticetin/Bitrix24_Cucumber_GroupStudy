package com.nextbasecrm.step_definitions.tasksPageStepDef;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import com.nextbasecrm.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

        BrowserUtils.waitFor(2);
        BrowserUtils.setAttribute(pages.tasksPage().descriptionInput, "value", enterTaskData.get(1));
        BrowserUtils.waitFor(2);

        // Dikkat JS ile value attribute değer ata SELECT e tıklamadan kaydetmiyor!!

//        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
//        jse.executeScript("arguments[0].value='"+enterTaskData.get(2)+"';",pages.tasksPage().dateInput );
        //BrowserUtils.setAttribute(pages.tasksPage().dateInput, "value", enterTaskData.get(2));
        pages.tasksPage().dateInput.click();
        BrowserUtils.waitFor(1);
        pages.tasksPage().selectYearInDropDown(enterTaskData.get(4));
        BrowserUtils.waitFor(2);
        pages.tasksPage().selectMonthInDropDown(enterTaskData.get(3));
        BrowserUtils.waitFor(2);
        pages.tasksPage().selectDayOnTable(enterTaskData.get(2));
        BrowserUtils.waitFor(1);
        pages.tasksPage().selectDateButton.click();

        pages.tasksPage().addButton.click();
        Driver.get().switchTo().defaultContent();

    }

    @Then("verify the task on the page with has following credentials: {string} {string}")
    public void verifyTheTaskOnThePageWithHasFollowingCredentials(String meetingName, String meetingDate) {

        WebElement actualDateElement = Driver.get().findElement
                (By.xpath("//a[contains(text(),'" + meetingName + "')]/../../following-sibling::td//span[contains(text(),'" + meetingDate + "')]"));
        String actualDate = actualDateElement.getText();

        meetingDate= meetingDate.replace(", ", ",");
        Assert.assertEquals(meetingDate, actualDate);
        // short way
        Assert.assertTrue(actualDateElement.isDisplayed());






    }
}
