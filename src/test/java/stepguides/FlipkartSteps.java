package stepguides;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlipkartSteps {
	
	public WebDriver driver;
	
	@Given("User opens {string} and on Landing page")
	public void user_opens_and_on_landing_page(String string) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuhin\\OneDrive\\Desktop\\Java_workspace\\MicrsoftTest\\src\\main\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to(string);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	    //Verification of User landed on landing page	    
	    String title = driver.getTitle();
	    assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	    
	}

	@Given("User is not logged in")
	public void user_is_not_logged_in() {
	    WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
	    String textOfLoginBtn = loginBtn.getText();
	    assertEquals(textOfLoginBtn, "Login");
	}

	@Then("User searches for {string}")
	public void user_searchs_for(String string) {
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    
	    
	}
	
	
	
	

}
