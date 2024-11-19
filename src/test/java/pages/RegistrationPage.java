package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	  WebDriver driver;

	    @FindBy(id = "firstname") WebElement firstNameField;
	    @FindBy(id = "lastname") WebElement lastNameField;
	    @FindBy(id = "email_address") WebElement emailField;
	    @FindBy(id = "password") WebElement passwordField;
	    @FindBy(id = "password-confirmation") WebElement confirmPasswordField;
	    @FindBy(css = "button[title='Create an Account']") WebElement submitButton;

	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
	        firstNameField.sendKeys(firstName);
	        lastNameField.sendKeys(lastName);
	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);
	        confirmPasswordField.sendKeys(password);
	    }

	    public void submitForm() {
	        submitButton.click();
	    }
}
