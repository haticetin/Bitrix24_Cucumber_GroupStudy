package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.dnd.DragGestureEvent;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReader.get("url"));

//    Actions actions;
//    WebDriverWait wait;

//        actions = new Actions(Driver.get());
//        wait = new WebDriverWait(Driver.get(),10);
    }


    @After
    public void tearDown(){

        // screenshoot ekle!!!
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
