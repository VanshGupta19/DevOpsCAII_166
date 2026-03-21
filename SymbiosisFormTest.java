package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SymbiosisFormTest {

    public static void main(String[] args) {

        // 1. Set path of ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HARSHA VARDHAN\\OneDrive\\Desktop\\chromedriver.exe");

        // 2. Launch browser
        WebDriver driver = new ChromeDriver();

        // 3. Open your HTML form
        driver.get("C:\\Users\\HARSHA VARDHAN\\OneDrive\\Desktop\\devops CA2/index.html");

        // 4. Maximize window
        driver.manage().window().maximize();

        // 5. Enter Name
        driver.findElement(By.name("name"))
                .sendKeys("Harsha Vardhan");

        // 6. Enter Email
        driver.findElement(By.name("email"))
                .sendKeys("harsha@gmail.com");

        // 7. Enter Password
        driver.findElement(By.name("password"))
                .sendKeys("123456");

        // 8. Enter Confirm Password
        driver.findElement(By.name("confirm_password"))
                .sendKeys("123456");

        // 9. Select Gender (Male)
        driver.findElement(By.xpath("//input[@value='Male']"))
                .click();

        // 10. Select Course
        driver.findElement(By.tagName("select"))
                .sendKeys("BTech");

        // 11. Click Register Button
        driver.findElement(By.className("submit-btn"))
                .click();

        // 12. Validation (simple check)
        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("index.html")) {
            System.out.println("✅ FORM SUBMITTED SUCCESSFULLY");
        } else {
            System.out.println("❌ FORM SUBMISSION FAILED");
        }

        // 13. Close browser
        driver.quit();
    }
}