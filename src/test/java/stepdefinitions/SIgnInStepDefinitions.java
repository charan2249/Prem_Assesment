package stepdefinitions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;

public class SIgnInStepDefinitions {
	WebDriver driver;
    SignInPage signInPage;

    @Given("I am on the sign-in-page")
    public void i_am_on_the_sign_in_page() {
    	

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login");
        signInPage = new SignInPage(driver);
        //throw new io.cucumber.java.PendingException();
       
        }
        
    @When("I enter valid details")
    public void i_enter_Valid_user_Details() {
        SignInPage.login("premkumarkandela@gmail.com", "Jasmine@098s");
        //throw new io.cucumber.java.PendingException();
    }

    @And("I click on {string}")
    public void i_click_on(String button) {
    	WebElement element;
        try {
            element = driver.findElement(By.xpath("//span[text()='Sign In']" + button + "']"));
        } catch (NoSuchElementException e) {
            // If button label is not found, assume it's an ID or other locator
            element = driver.findElement(By.id("send2"));  // Assuming the string passed is an ID
        }
        element.click();
        System.out.println("CLicked sign in!");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
    	System.out.println("Logged In successfully");
    	
        driver.quit();
        //throw new io.cucumber.java.PendingException();
    }
}
