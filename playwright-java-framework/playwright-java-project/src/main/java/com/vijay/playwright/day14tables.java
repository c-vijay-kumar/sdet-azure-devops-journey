package com.vijay.playwright;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class day14tables {
    public static void main(String[] args) {
        try (Playwright p = Playwright.create()) {
            Browser b = p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = b.newContext();
            Page page = context.newPage();
            page.navigate("https://demoqa.com/webtables");

            Locator rows = page.locator("table tbody tr");
            System.out.println(rows.count());

            Locator cierraRow = rows.filter(new Locator.FilterOptions().setHasText("Cierra"));
            cierraRow.getByTitle("Edit").click();

            // Optional: verify the value BEFORE editing, using hasValue on the input
            Locator salaryInput = page.locator("#salary");
            salaryInput.clear();
            salaryInput.fill("12500");

            page.locator("#submit").click(); // save the change

            // Re-locate the row AFTER the update — modal is gone, table has refreshed
            Locator updatedRow = page.locator("table tbody tr").filter(new Locator.FilterOptions().setHasText("Cierra"));
            assertThat(updatedRow).containsText("1250000");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}