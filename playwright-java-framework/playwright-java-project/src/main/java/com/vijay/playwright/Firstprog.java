package com.vijay.playwright;
import java.nio.file.Paths;
import com.microsoft.playwright.*;
public class Firstprog {
    public static void main(String[] args) {
        Playwright p=Playwright.create();
        Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=b.newContext();
        Page page=context.newPage();
        page.navigate("https://playwright.dev/");
        System.out.println("Page Title is :"+ page.title());
        System.out.println("Page URL is :"+ page.url());
        page.screenshot(new Page.ScreenshotOptions()
                        .setPath(Paths.get("screenshots/playwright-home.png")));
        context.close();
        b.close();
        p.close();
    }
}
