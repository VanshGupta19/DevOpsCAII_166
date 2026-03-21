package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro {

	public static void main(String[] args) {
		// 1. Set path of ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HARSHA VARDHAN\\OneDrive\\Desktop\\chromedriver.exe");

        // 2. Launch browser
        WebDriver driver = new ChromeDriver();

        // 3. Open website
        driver.get("https://the-internet.herokuapp.com/login");

        // 4. Maximize window
        driver.manage().window().maximize();

        // 5. Enter username
        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        // 6. Enter password
        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        // 7. Click login button
        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        // 8. Capture success message
        String message = driver.findElement(By.id("flash")).getText();

        // 9. Validation
        if (message.contains("You logged into a secure area")) {
            System.out.println("✅ TEST PASSED");
        } else {
            System.out.println("❌ TEST FAILED");
        }

        // 10. Close browser
        driver.quit();

	}

}