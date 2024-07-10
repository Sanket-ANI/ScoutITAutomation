package com.scoutIT.test;

import com.scoutIT.pages.AppPage;
import com.scoutIT.pages.LandingPage;
import com.scoutIT.pages.LoginPage;
import org.testng.annotations.Test;

public class AppTest extends BaseTest{

    @Test
    public void AddCustomApp()
    {
        AppPage appPage=new AppPage(super.driver);
        LandingPage landingPage=appPage.App("https://app.ssemble.com","Vloger987","Automation test","email","password","css-x17fer","nishant@ssemble.com","Think@105");
    }
}
