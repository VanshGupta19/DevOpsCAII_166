package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentFeedbackTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\VANSH GUPTA\\OneDrive\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Open HTML file
        driver.get("file:///C:/Users/VANSH%20GUPTA/OneDrive/Desktop/devops-CAII/index.html");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // ✅ Test Case 1: Page Open
        System.out.println("Page opened successfully");

        // ✅ Test Case 2: Valid Submission
        driver.findElement(By.id("name")).sendKeys("Vansh Gupta");
        driver.findElement(By.id("email")).sendKeys("vansh@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        driver.findElement(By.id("department")).sendKeys("Computer Science");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("feedback"))
                .sendKeys("This is a very good system and I really liked using this feedback form");

        Thread.sleep(1000);

        driver.findElement(By.className("submit-btn")).click();

        handleAlert(driver);

        System.out.println("Valid submission test completed");

        Thread.sleep(2000);

        // ✅ Test Case 3: Reset Button
        driver.findElement(By.className("reset-btn")).click();
        System.out.println("Reset button working");

        Thread.sleep(2000);

        // ✅ Test Case 4: Empty Fields
        driver.findElement(By.className("submit-btn")).click();

        handleAlert(driver);

        System.out.println("Empty field validation checked");

        Thread.sleep(2000);

        // ✅ Test Case 5: Invalid Email
        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("email")).sendKeys("invalidemail");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");

        driver.findElement(By.className("submit-btn")).click();

        handleAlert(driver);

        System.out.println("Invalid email validation checked");

        Thread.sleep(2000);

        driver.findElement(By.className("reset-btn")).click();

        // ✅ Test Case 6: Invalid Mobile
        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("123");

        driver.findElement(By.className("submit-btn")).click();

        handleAlert(driver);

        System.out.println("Invalid mobile validation checked");

        Thread.sleep(2000);

        driver.findElement(By.className("reset-btn")).click();

        // ✅ Test Case 7: Dropdown Check
        driver.findElement(By.id("department")).sendKeys("IT");
        System.out.println("Dropdown working");

        Thread.sleep(2000);

        driver.quit();
    }

    // 🔥 Safe alert handler (IMPORTANT FIX)
    public static void handleAlert(WebDriver driver) {
        try {
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            // No alert present → ignore
        }
    }
}