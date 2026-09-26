package com.vijay.playwright;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;;
public class Day13alerts {
    public static void main(String[] args){
        try(Playwright p=Playwright.create()){
            Browser B= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context=B.newContext();
            Page page= context.newPage();
            page.navigate("https://the-internet.herokuapp.com/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("JavaScript Alerts")).click();
            page.onDialog(dialog ->{
                System.out.println("Type" + dialog.type() +"dialog message "+dialog.message());
                if(dialog.type().equals("Confirm")){
                    dialog.dismiss();
                }else if(dialog.type().equals("Prompt")){
                    dialog.accept("this is vijay's prompt");
                }else{
                    dialog.accept();
                }
            });
            page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Click for JS Alert")).click();
            page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Click for JS Confirm")).click();
            page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Click for JS Prompt")).click();
            System.out.println("Alerts are done");
        }

    }
}
