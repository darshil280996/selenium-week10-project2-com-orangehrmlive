package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMAutomation {

    public static void main(String[] args) {
        // 1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open URL.
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 3. Print the title of the page.
        System.out.println("Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Click on ‘Forgot your password?’ link.
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
        forgotPasswordLink.click();

        // 7. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 8. Navigate back to the login page.
        driver.navigate().back();

        // 9. Refresh the page.
        driver.navigate().refresh();

        // 10. Enter the email to the email field.
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // 11. Enter the password to the password field.
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // 12. Click on Login Button.
        WebElement loginButton = driver.findElement(By.partialLinkText("orangehrm-login-button"));
        loginButton.click();

        // 13. Close the browser.
        driver.quit();
    }
}
