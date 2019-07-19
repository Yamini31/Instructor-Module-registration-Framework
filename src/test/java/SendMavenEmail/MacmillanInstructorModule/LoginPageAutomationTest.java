package SendMavenEmail.MacmillanInstructorModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageAutomationTest {
  
	static WebDriver driver = new ChromeDriver();


	@BeforeTest
  public void Test1LaunchDriver() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.Driver", "/home/qainfotech/Downloads/chromedriver");
		driver.get("https://staging.macmillan-learning.com/college/us");
		driver.manage().window().maximize();
		Thread.sleep(2000);

 }
	@Test
	public void Test2Clickonsignin() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href=\"/college/us/login\"]")).click();
		Thread.sleep(2000);
	}

	
	
	@Test
  public void Test3Username() throws InterruptedException {
	  
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("test");
		Thread.sleep(1000);
	  
  }

	@Test
  public void Test4Password() throws InterruptedException {
	  
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("test");
		Thread.sleep(1000);
	  
  }
	

	@Test
  public void Test5() throws InterruptedException {
	  
		driver.findElement(By.xpath("//button[@id=\"signin\"]")).click();

		Thread.sleep(1000);
	  
  }
	
	
	
	
	@Test(dependsOnMethods= {"Test3Username","Test4Password"})
	  public void Test4CheckUsername() throws InterruptedException {
		  		
		String name = driver.findElement(By.xpath("//div[@class=\"errorText\"]")).getText();
		String errorText="Invalid username or password";
		if(name.equals(errorText))
		{
			System.out.println("Please enter the valid username  and password");
		}
		
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
