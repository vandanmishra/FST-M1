import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/drag-drop");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the football
        WebElement football = driver.findElement(By.id("ball"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(football).moveToElement(dropzone1).pause(5000).release().build().perform();
        if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(football, dropzone2).pause(5000).build().perform();
        if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }

        // Close the browser
        driver.quit();
    }
}

Activity 12
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the actions variable
    actions = ActionChains(driver)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/drag-drop")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the football
    football = driver.find_element(By.ID, "ball")
    # Find the dropzone1
    dropzone1 = driver.find_element(By.ID, "dropzone1")
    # Find the dropzone2
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    # Perform drag and drop to dropzone 1
    actions.click_and_hold(football).move_to_element(dropzone1).pause(5).release().perform()
    if(dropzone1.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
        print("Ball was dropped in Dropzone 1")

    # Perform drag and drop to dropzone 2
    actions.drag_and_drop(football, dropzone2).pause(5).perform()
    if(dropzone2.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
        print("Ball was dropped in Dropzone 2")

Handling Multiple Elements
Finding Multiple Web Elements
To find multiple WebElements on a web page, we use:

driver.findElements() in Java
driver.find_elements() in Python
Its usage is very limited. We interact with single elements far more than multiple elements.
Both methods return a list of all the elements matching the specified locator.
If the element doesn’t exist or is not available on the page then, the return value will be an empty list.
List<WebElement> elements = driver.findElements(By.xpath("//table/tr"));
elements = driver.find_elements(By.XPATH, "//table/tr")


Handling Web Tables
35 . 2



