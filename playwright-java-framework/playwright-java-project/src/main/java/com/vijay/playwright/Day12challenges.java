package com.vijay.playwright;

import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class Day12challenges {
    public static void main(String[] args){
        try(Playwright p=Playwright.create()){
            Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context= b.newContext();
            Page page=context.newPage();
            page.navigate("https://www.saucedemo.com/");
            assertThat(page).hasTitle("Swag Labs");
            System.out.println("test passed");    //"assertion expect the application to be in this state
            PlaywrightAssertions.setDefaultAssertionTimeout(10_000);
            assertThat(page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("login"))).isEnabled();
            System.out.println("yes it's disbaled");

        }
    }
}
