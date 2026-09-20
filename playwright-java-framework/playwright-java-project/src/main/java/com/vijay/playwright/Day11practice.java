package com.vijay.playwright;
import java.time.LocalDate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Playwright.*;
import com.microsoft.playwright.options.AriaRole;
public class Day11practice {
    public static void main(String[] args){
        Playwright p=Playwright.create();
        Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=b.newContext();
        Page page=context.newPage();
        page.navigate("https://www.saucedemo.com");
        page.getByLabel("Username").fill("standard_user");
        page.getByLabel("Password").fill("secret_sauce");
        page.locator("#login-button").press("Enter");
    }
}
