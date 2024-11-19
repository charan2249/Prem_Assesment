package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinitions {
	WebDriver driver = Hooks.driver;; // Make sure you initialize this (e.g., in a hooks class or before scenario)
    WebDriverWait wait;

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @When("I fill out the form with valid details")
    public void i_fill_out_the_form_with_valid_details() {
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("lastname")).sendKeys("Doe");
        driver.findElement(By.id("email_address")).sendKeys("johndoe@example.com");
        driver.findElement(By.id("password")).sendKeys("Test@1234");
        driver.findElement(By.id("password-confirmation")).sendKeys("Test@1234");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
       
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".message-success")));
        assert successMessage.isDisplayed();
    }
}
