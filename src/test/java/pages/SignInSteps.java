package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	WebDriver driver;
    SignInPage signinPage;

    @Given("I am on the sign-in-page")
    public void I_am_on_the_sign_in_page() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login");
        signinPage = new SignInPage(driver);
    }

    @When("I enter valid details")
    public void I_enter_valid_details() {
    	signinPage.fillRegistrationForm("John", "Doe", "johndoe@example.com", "Password123");
    }

   

    @Then("I should be logged in successfully")
    public void I_should_be_logged_in_successfully() {
        // Add an assertion for success message
        driver.quit();
    }
}
