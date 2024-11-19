package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver; // Make WebDriver static so it's shared across steps

    @Before
    public void setUp() {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Demo\\server\\chromedriver-win64\\chromedriver.exe");
    	 
        // Initialize the WebDriver
    	
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // Quit the WebDriver after each scenario
        if (driver != null) {
            driver.quit();
        }
    }
}
