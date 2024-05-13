package com.scoutIT.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);

        // Assert.assertEquals(driver.findElements(By.xpath("//div[contains(@class,'MuiDrawer-paper')]")).size(),1,"Not on Landing Page");
    }
}
