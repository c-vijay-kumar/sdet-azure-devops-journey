package com.vijay.playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class Day11challenges {
    public static void main(String[] args){
        Playwright p=Playwright.create();
        Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=b.newContext();
        Page page =context.newPage();
        page.navigate("https://the-internet.herokuapp.com/");
        // page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Checkboxes")).click();
        // Locator checkbox=page.getByRole(AriaRole.CHECKBOX);
        // checkbox.nth(0).check();
        // checkbox.nth(1).uncheck();
        // page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Dropdown")).click();
        // page.locator("#dropdown").click();
        // page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Option 1")).click();
        //page.navigate("https://www.saucedemo.com/");
        // page.getByText("Hovers").click();
        // Locator hover=page.locator(".figure");
        // hover.nth(0).hover();
        // hover.nth(2).hover();
        // page.getByText("Drag and Drop").click();
        // Locator source = page.locator("#column-a");
        // Locator target = page.locator("#column-b");
        // source.dragTo(target);
        // page.getByText("File Upload").click();
        // page.locator("#file-upload").setInputFiles(Paths.get("C:\\Users\\santh\\Documents\\sdet-azure-devops-journey\\vijay.txt"));
        // page.locator("#file-submit").click();
        // 
        
        

        


    }
}
