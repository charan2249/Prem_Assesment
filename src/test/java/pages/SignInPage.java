package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	 WebDriver driver;

	    @FindBy(id = "email") WebElement emailField;
	    @FindBy(id = "pass") WebElement passwordField;
	    @FindBy(xpath  = "(//span[text()='Sign In'])[1]") WebElement submitButton;

	    public SignInPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
	       
	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);
	        
	    }

	    public void submitForm() {
	        submitButton.click();
	    }

		public static void login(String string, String string2) {
			// TODO Auto-generated method stub
			
		}
}
