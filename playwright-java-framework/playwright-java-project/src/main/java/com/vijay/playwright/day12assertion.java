package com.vijay.playwright;

import com.microsoft.playwright.BrowserType;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.*;

public class day12assertion {
    public static void main(String[] args){
        try(Playwright p=Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context=b.newContext();
            Page page =context.newPage();
            page.navigate("https://www.saucedemo.com/");
            Locator username = page.getByLabel("Username");
            Locator password = page.getByLabel("Password");
            Locator login= page.locator("#login-button");
            username.fill("standard_user");
            password.fill("secret_sauce");
            login.click();
            assertThat(page).hasURL("https://www.saucedemo.com/inventory.html");
            assertThat(page.getByText("Swag Labs")).isVisible();
            System.out.println("Test is passed");
            assertThat(page.getByText("Add to cart")).hasCount(6);
            System.out.println("count of the products is also matched");
        }

    }
}
