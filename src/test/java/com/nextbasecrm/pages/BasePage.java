package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    @FindBy(id = "siteMap-menu")
    public WebElement siteMapMenu;

    @FindBy(id = "timeman-container")
    public WebElement timeman;

    @FindBy(id = "search-textbox-input")
    public WebElement searchBar;

    @FindBy(css = "#user-name")
    public WebElement userName;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    public WebElement logOut;

    @FindBy(xpath = "//span[contains(text(),'My Profile')]")
    public WebElement myProfile;

    @FindBy(css = "div.help-block-icon")
    public WebElement helpIcon;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * @return page Title, for example: Activity Stream, Tasks
     */
    public String getPageTitle() {

//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageTitle.getText();
    }


    public String getUserName(){
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOut);
    }


    public void goToMyProfile(){

        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myProfile, 5).click();

    }

    /**
     * This method will navigate user to the specific tab in nextbasecrm application.
     * For example: if tab is equals to activity Stream
     *
     * @param tab
     */
    public void navigateToModule(String tab) {

        tab = initialLetterCovert(tab);

        String tabLocator = "//span[@class='menu-item-link-text'][contains(text(),'"+tab+"')]";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            tabElement.click();
            //new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();//span[@class='menu-item-link-text'][contains(text(),'Mail')]
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }


    /**
     * This method will capitalizes the first letters of the words in the sentence.
     * For example: srt input =" CHAT AND CALLS " output: "Chat and Class"
     * For useing navigate tab we need this format of string .. By Talha***
     *
     * @param str
     */
    public String initialLetterCovert(String str){

        String[] strArray = str.toLowerCase().split(" ");
        String newStr="";
        if (strArray.length>1) {
            for (String s : strArray) {
                if (!s.equalsIgnoreCase("and")) {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                    newStr += s + " ";
                } else {
                    newStr += "and ";
                }
            }
        } else {
            return  Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }

        return newStr;
    }





}