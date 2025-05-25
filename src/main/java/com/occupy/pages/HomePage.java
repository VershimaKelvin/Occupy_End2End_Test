package com.occupy.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {

    Page page;
    private Locator loginButton;
    private Locator registerButton;

    public HomePage(Page page){
        this.page = page;
        loginButton =   page.locator("button.rounded-full.bg-occupy-primary.px-16.py-4.text-sm.font-medium.text-white");
        registerButton = page.locator("button.bg-occupy-primary.text-white.font-bold");
    }

   public Locator getLoginButton(){
       return loginButton;
   }

    public Locator getSignUpButton(){
        return registerButton;
    }
}
