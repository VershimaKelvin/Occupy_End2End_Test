package com.occupy.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;

    public Page intiBrowser(String browserName){
        playwright = Playwright.create();
        switch (browserName){
            case "chrome" :
                browser = playwright.chromium()
                        .launch( new BrowserType.LaunchOptions().setChannel("chrome")
                                .setHeadless(false)
                                .setSlowMo(200));
                break;
            case "firefox"  :
                browser= playwright.firefox()
                        .launch( new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setSlowMo(100));
                break;
            case "safari":
                browser = playwright.webkit()
                        .launch(new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setSlowMo(100));
                break;
            case "chromium"  :
                browser= playwright.chromium()
                        .launch( new BrowserType.LaunchOptions()
                                .setHeadless(false)
                                .setSlowMo(100));
                break;

            default:
                System.out.println("please pass the correct browser name");
        }
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("https://www.occupymart.com/");

        return  page;
    }

}
