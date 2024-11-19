package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	WebDriver driver;
    RegistrationPage registrationPage;

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        registrationPage = new RegistrationPage(driver);
    }

    @When("I fill out the form with valid details")
    public void i_fill_out_the_form_with_valid_details() {
        registrationPage.fillRegistrationForm("John", "Doe", "johndoe@example.com", "Password123");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        registrationPage.submitForm();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        // Add an assertion for success message
        driver.quit();
    }

}
