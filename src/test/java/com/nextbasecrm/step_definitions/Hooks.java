package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.dnd.DragGestureEvent;
import java.util.concurrent.TimeUnit;

public class Hooks {

    Actions actions;
    WebDriverWait wait;

    @Before
    public void setUp(){

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(Driver.get());
        wait = new WebDriverWait(Driver.get(),10);
    }


    @After
    public void tearDown(){

        // screenshoot ekle!!!
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
