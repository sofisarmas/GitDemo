package CEPApp.stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	@Test
	@Given("Open the Rahul shetty url.")
	public void open_the_rahul_shetty_url() {
	   System.out.println("Open the Rahul shetty url.");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	   driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
	}
	
	@Test
	@When("user enters name into alert text field.")
	public void user_enters_name_into_alert_text_field() {
	   System.out.println("user enters name into alert text field.");
	   driver.findElement(By.id("name")).sendKeys("Sofi");
	}

	@Test
	@And("user clicks on alert button.")
	public void user_clicks_on_alert_button() {
	   System.out.println("user clicks on alert button.");
	   driver.findElement(By.id("alertbtn")).click();
	}

	@Test
	@Then("alert pop up should display.")
	public void alert_pop_up_should_display() {
	   System.out.println("alert pop up should display.");
	   String popupMessage=driver.switchTo().alert().getText();
	   System.out.println(popupMessage);
	}
}
