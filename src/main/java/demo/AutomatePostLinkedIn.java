package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePostLinkedIn {
    public static void automatePost() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://in.linkedin.com/");

        WebElement emailField = driver.findElement(By.id("session_key"));
        WebElement passwordField = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.cssSelector(".sign-in-form__submit-button"));

        // Provide your actual email and password here
        emailField.sendKeys("your_email");
        passwordField.sendKeys("your_password");
        signInButton.click();

        WebElement profileViews = driver.findElement(By.cssSelector(".mn-connections__entity-info strong"));
        WebElement postImpressions = driver.findElement(By.cssSelector(".mn-feed-summary__viewer-count"));

        System.out.println("Who's viewed your profile: " + profileViews.getText());
        System.out.println("Impressions of your post: " + postImpressions.getText());

        // Rest of your code to automate posting on LinkedIn

        driver.quit();
    }
}