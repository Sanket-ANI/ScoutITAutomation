package com.scoutIT.test;

import com.scoutIT.pages.LandingPage;
import com.scoutIT.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validateLoginFunctionalityForValidCredentials(){
        LoginPage loginPage = new LoginPage(super.driver);
        LandingPage landingPage = loginPage.login("Automation@mailinator.com","Test@123");
        String Expected_Title="Dashboard";
        String Actual_title=driver.getTitle();
        Assert.assertEquals(Actual_title,Expected_Title);

    }

}