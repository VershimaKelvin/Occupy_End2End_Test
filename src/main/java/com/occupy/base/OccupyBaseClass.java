package com.occupy.base;

import com.microsoft.playwright.Page;
import com.occupy.factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OccupyBaseClass {

    public Page page;

    @BeforeTest
    public void setup(){
        PlaywrightFactory playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.intiBrowser("firefox");
    }

    @AfterTest
    public void tearDown(){
        page.close();
    }


}
