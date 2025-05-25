package com.occupy.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {

    Page page;
    private Locator loginButton;
    private Locator registerButton;
    private Locator customerButton;
    private Locator riderButton;
    private Locator supermarketButton;
    private Locator exploreSupermarket;
    private Locator earnWeekly;
    private Locator onlinePresenceText;

    public HomePage(Page page){
        this.page = page;
        loginButton =   page.locator("button.rounded-full.bg-occupy-primary.px-16.py-4.text-sm.font-medium.text-white");
        registerButton = page.locator("button.bg-occupy-primary.text-white.font-bold");
        customerButton = page.locator("button.bg-occupy-primary.text-white[value=\"customer\"]");
        riderButton = page.locator("button.bg-\\[\\#FFE2F3\\].text-black[value=\"rider\"]");
        supermarketButton = page.locator("button.bg-\\[\\#FFE2F3\\].text-black[value=\"supermarket\"]");
    }

   public Locator getLoginButton(){
       return loginButton;
   }

    public Locator getSignUpButton(){
        return registerButton;
    }

    public Locator getCustomerButton(){
        return customerButton;
    }

    public Locator getRiderButton(){
        return riderButton;
    }

    public Locator getSupermarketButtonRiderButton(){
        return supermarketButton;
    }

    public Locator exploreSupermarketmeth(){
        exploreSupermarket =page.locator("button.bg-occupy-primary.text-white.font-semibold[value=\"customer\"]");
        return exploreSupermarket;
    }

    public Locator earnWeeklyRider(){
        riderButton.click();
        earnWeekly =  page.locator("p.text-4xl.font-bold.text-\\[\\#090335\\][class*='leading-tight']");
        return earnWeekly;
    }

    public Locator onlinePresence(){

        supermarketButton.click();
        onlinePresenceText =  page.locator("p.text-4xl.font-bold.text-\\[\\#090335\\][class*='leading-tight']");
        return onlinePresenceText;

    }

    public Locator exploreSupermarketmethAgain(){
        exploreSupermarket=null;
        customerButton.click();
        exploreSupermarket =page.locator("button.bg-occupy-primary.text-white.font-semibold[value=\"customer\"]");
        return exploreSupermarket;
    }


}
