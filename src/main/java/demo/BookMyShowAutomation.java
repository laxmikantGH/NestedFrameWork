package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowAutomation {

        public static void selectImageURL(){
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the BookMyShow website
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

        // Find and print the image URLs for all "Recommended Movies"
        System.out.println("Image URLs for Recommended Movies:");
        for (WebElement element : driver.findElements(By.xpath("//div[@class='cards']//img"))) {
            System.out.println(element.getAttribute("src"));
        }

        // Find and print the Name & Language of the 2nd item in the "Premiere" list
        WebElement premiereItem = driver.findElements(By.xpath("//div[@data-filter-name='Premiere']//div[@class='cards']")).get(1);
        String name = premiereItem.findElement(By.xpath(".//div[@class='detail']//a")).getText();
        String language = premiereItem.findElement(By.xpath(".//div[@class='detail']//div[contains(text(), 'Language:')]/following-sibling::div")).getText();

        System.out.println("Name of the 2nd Premiere item: " + name);
        System.out.println("Language of the 2nd Premiere item: " + language);

        // Close the browser
        driver.quit();
        }
}
