package com.vijay.playwright;

import com.microsoft.playwright.*;

public class multiplebrowsers {
    public static void main(String[] args){
        Playwright p=Playwright.create();
        Browser b1=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context1=b1.newContext();
        BrowserContext context2=b1.newContext();
        Page tab1=context1.newPage();
        Page tab2=context2.newPage();
        tab1.navigate("https://playwright.dev/");
        tab2.navigate("https://www.google.com/");
    }
}
