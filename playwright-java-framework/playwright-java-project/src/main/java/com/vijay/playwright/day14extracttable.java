package com.vijay.playwright;

import java.util.List;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class day14extracttable {
    public static void main(String[] args){
        try(Playwright p = Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = b.newContext();
            Page page= context.newPage();
            page.navigate("https://demoqa.com/webtables");
            // Locator table=page.locator("table tbody tr");
            // int rowsize = table.count();
            // for(int i=0;i<rowsize;i++){
                // String row= table.nth(i).innerText();
                // System.out.println(row);
            // }

            List<Locator> allitems= page.getByRole(AriaRole.LISTITEM).all();
            for(Locator item: allitems){
                System.out.println(item.innerText());
            }
        }
    }
}
