package com.vijay.playwright;

import com.microsoft.playwright.*;

public class day14challenges {
    public static void main(String[] args) {
        try(Playwright p = Playwright.create()){
            Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context= b.newContext();
            Page page= context.newPage();
            page.navigate("https://demoqa.com/webtables");
            Locator table = page.locator("table tbody tr");
            Locator row = table.filter(new Locator.FilterOptions().setHasText("Cierra"));
            row.getByTitle("Edit").click();
        }
    }
}
