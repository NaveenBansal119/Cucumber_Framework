package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke {
	
	WebDriver driver;
	@Given("^open firfox and start application$")
	public void open_firfox_and_start_application() throws Throwable {
 	System.setProperty("webdriver.chrome.driver","C:\\Windows\\Seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
	    
	}

	@When("^i enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	    
	}

	@Then("^user should be able to login sucessfully.$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	    driver.quit();
	}


}
