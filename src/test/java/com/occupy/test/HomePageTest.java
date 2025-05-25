package com.occupy.test;
import com.occupy.base.OccupyBaseClass;
import com.occupy.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends OccupyBaseClass {


    HomePage homePage;



    @Test
    public void verifyLoginButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getLoginButton().isVisible());
    }

    @Test
    public void verifySignupButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getSignUpButton().isVisible());
    }

    @Test
    public void verifyCustomerButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getCustomerButton().isVisible());
    }

    @Test
    public void verifySupermarketButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getSupermarketButtonRiderButton().isVisible());
    }

    @Test
    public void verifyRiderButton(){
        homePage = new HomePage(page);
        Assert.assertTrue(homePage.getRiderButton().isVisible());
    }

    @Test
    public void verifyExplorSupermarket(){
        Assert.assertTrue(homePage.exploreSupermarketmeth().isVisible());
    }

    @Test
    public void verifyRiderInfo(){
        Assert.assertTrue(homePage.earnWeeklyRider().isVisible());
    }

    @Test
    public void verifySupermarketDetail(){
        Assert.assertTrue(homePage.onlinePresence().isVisible());
    }

    @Test
    public void verifyExplorSupermarketAgain(){
        Assert.assertTrue(homePage.exploreSupermarketmethAgain().isVisible());
    }





}
