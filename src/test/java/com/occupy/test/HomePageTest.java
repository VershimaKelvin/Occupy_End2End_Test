package com.occupy.test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.occupy.base.OccupyBaseClass;
import com.occupy.factory.PlaywrightFactory;
import com.occupy.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends OccupyBaseClass {


    HomePage homePage;

    @Test
    public void homePageTest(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getLoginButton().isVisible());
    }

    @Test
    public void homePageTestRegisterButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getSignUpButton().isVisible());
    }


}
