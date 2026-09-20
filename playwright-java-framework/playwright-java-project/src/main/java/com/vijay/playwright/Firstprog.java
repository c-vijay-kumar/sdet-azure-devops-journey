package com.vijay.playwright;
import java.nio.file.Paths;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
public class Firstprog {
    public static void main(String[] args) {
        Playwright p=Playwright.create();
        Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=b.newContext();
        Page page=context.newPage();
        page.navigate("https://saucedemo.com");
        // System.out.println("Page Title is :"+ page.title());
        // System.out.println("Page URL is :"+ page.url());
        // page.screenshot(new Page.ScreenshotOptions()
                        // .setPath(Paths.get("screenshots/playwright-home.png")));
        page.getByLabel("Username").fill("standard_user");
        page.getByLabel("Password").fill("secret_sauce");
        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Login")).click();
        page.getByAltText("Sauce Labs Bolt T-Shirt").click();
        page.locator(".back-image").click();
        Locator cart = page.locator(".inventory_item").filter(new Locator.FilterOptions().setHasText("Sauce Labs Bolt T-Shirt"));
        cart.getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Add to cart")).click();
        context.close();
        b.close();
        p.close();
    }
}
