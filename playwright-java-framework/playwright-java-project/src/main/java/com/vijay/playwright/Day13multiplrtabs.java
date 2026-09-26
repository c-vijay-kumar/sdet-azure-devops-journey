package com.vijay.playwright;

import com.microsoft.playwright.BrowserType;

import java.util.List;

import com.microsoft.playwright.*;

public class Day13multiplrtabs {
    public static void main(String[] args){
        try(Playwright p=Playwright.create()){
            Browser b= p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context=b.newContext();
            Page page=context.newPage();
            page.navigate("https://java.com");
            Page page2=context.newPage();
            page2.navigate("https://python.com");
            List<Page> pa=context.pages();
            System.out.println(pa.size());
        }
    }
}
