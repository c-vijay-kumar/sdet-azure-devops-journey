package com.vijay.playwright;

import java.time.LocalDate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class Day13 {
    public static void main(String[] args){
        try(Playwright p= Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = b.newContext();
            Page page = context.newPage();
            page.navigate("https://the-internet.herokuapp.com/");
            page.getByText("Frames").click();
             page.frameLocator("iFrames").getByLabel("Close").click();;
        }
    }
}
