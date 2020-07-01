package com.nextbasecrm.utilities;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.tasksPage.TasksPage;

public class Pages {

    private LoginPage loginPage;
    private TasksPage tasksPage;


    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }

    public TasksPage tasksPage(){
        if(tasksPage == null){
            tasksPage = new TasksPage();
        }
        return tasksPage;
    }
}
