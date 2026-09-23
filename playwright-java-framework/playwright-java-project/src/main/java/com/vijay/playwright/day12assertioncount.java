package com.vijay.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.*;

public class day12assertioncount {
    public static void main(String[] args) {
        try(Playwright p = Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = b.newContext();
            Page page = context.newPage();
            
        }
    }
}
