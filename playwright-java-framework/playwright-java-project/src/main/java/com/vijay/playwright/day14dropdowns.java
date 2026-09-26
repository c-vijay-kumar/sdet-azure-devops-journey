package com.vijay.playwright;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page.GetByTextOptions;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.*;

public class day14dropdowns {
    public static void main(String[] args) {
        try(Playwright p = Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext  context = b.newContext();
            Page page1=context.newPage();
            page1.navigate("https://the-internet.herokuapp.com/dropdown");
            page1.locator("#dropdown").selectOption("1");
            Page page2 =context.newPage();
            page2.navigate("https://demoqa.com/radio-button");
            page2.locator("#yesRadio").check();
            assertThat(page2.locator("#yesRadio")).isChecked();
            System.out.println("this is checked");
        }
    }
}
