package com.nextbasecrm.pages.activityStream;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActivityStreamPage extends BasePage {

    public void navigateToTab(String tab){

        WebElement tabElement = Driver.get().findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[contains(text(),'" + tab + "')]"));
        BrowserUtils.waitForClickablility(tabElement,5);
        // navigateToModule("Activity Stream");
        tabElement.click();
    }
}
