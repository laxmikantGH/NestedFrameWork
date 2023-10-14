import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCountHyperLinks {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (you should download the appropriate version)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Create a WebDriver instance (open a Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Open the provided URL
        String url = "https://in.bookmyshow.com/explore/home/chennai";
        driver.get(url);

        // Find all the hyperlinks on the page
        java.util.List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        // Print the count of hyperlinks
        int hyperlinkCount = hyperlinks.size();
        System.out.println("Total hyperlinks on the page: " + hyperlinkCount);

        // Close the browser
        driver.quit();
    }
}