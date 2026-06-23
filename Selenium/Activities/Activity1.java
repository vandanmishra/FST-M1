package FST_Coding_Training.FST_coding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://training-support.net");

        // Print home page title
        System.out.println("Home Page Title: " + driver.getTitle());

        // Click About Us button
        WebElement aboutUs = driver.findElement(By.linkText("About Us"));
        aboutUs.click();

        // Print new page title
        System.out.println("About Us Page Title: " + driver.getTitle());

        driver.quit();
    }
}