package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesExample {
    public static void nested(){
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Switch to the top frame
        driver.switchTo().frame("frame-top");

        // Switch to the left frame
        driver.switchTo().frame("frame-left");

        // Get the text from the left frame
        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Text in the left frame: " + leftFrameText);

        // Switch back to the top frame
        driver.switchTo().defaultContent();

        // Switch to the middle frame
        driver.switchTo().frame("frame-middle");

        // Get the text from the middle frame
        String middleFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Text in the middle frame: " + middleFrameText);

        // Switch back to the top frame
        driver.switchTo().defaultContent();

        // Switch to the right frame
        driver.switchTo().frame("frame-right");

        // Get the text from the right frame
        String rightFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Text in the right frame: " + rightFrameText);

        // Switch back to the top frame
        driver.switchTo().defaultContent();

        // Switch to the bottom frame
        driver.switchTo().frame("frame-bottom");

        // Get the text from the bottom frame
        String bottomFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Text in the bottom frame: " + bottomFrameText);

        // Close the browser
        driver.quit();
    }
    
}
