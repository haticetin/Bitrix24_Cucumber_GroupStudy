
package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LoginPage extends BasePage {

        @FindBy(name = "USER_LOGIN")
        WebElement userName;

        @FindBy(name = "USER_PASSWORD")
        WebElement password;

        @FindBy(css = ".login-btn")
        WebElement loginButton;

        @FindBy(css =".login-link-forgot-pass")
        WebElement forgotPasswordButton;


        public void loginAs(String user){

            userName.sendKeys(ConfigurationReader.get(user+"_username") );
            password.sendKeys(ConfigurationReader.get(user+"_password"));
            loginButton.click();
            BrowserUtils.waitFor(2);
        }

    }


