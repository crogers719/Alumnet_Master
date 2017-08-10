import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class AlumnetLoginTest_StepDef{
	@Given("^user opens Alumnet login page$")
	public void user_opens_alumnet_login_page(){
		driver=new FirefoxDriver();
		driver.get("https://alumnet.xyz");
	}
	
	@Then("^user enters loginid$")
	public void user_enters_loginid(){t
		driver.findElement(By.xpath("//[@id='username']")).sendKeys("test@gmail.com"");
	}
	
	@Then("^user enters password$")
	public void user_enters_password(){
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password123");
	}
	
	@Then ("^get the title of Alumnet login page and verify")
	public void verify_Alumnet_login_Page_Title(){
		String title= driver.getTitle();
		Assert.assertEquals("Alumnet", title);
		
	}
	
	@And("^user clicks on signin button$")
	public void user_clicks_on_signin_button(){
		driver.findElement(By.xpath("//*[@id='login']")).click();
	}
	
	@And("^close the browser")
	public void close_the_browser(){
		driver.quit();
	}
}
