package SendMavenEmail.MacmillanInstructorModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPage {
	static WebDriver driver = new ChromeDriver();

	public static void launchbrowser() throws IOException {
		System.setProperty("webdriver.chrome.Driver",yamlReader.readingDataFromYamlFile("driverpathinfo"));
		driver.manage().window().maximize();

	}

	public static void getDriver(String url) {
		driver.get(url);
	}

	/*
	 * public static WebElement elementXpath(String path) { return
	 * driver.findElement(By.xpath(path)); }
	 * 
	 * public static WebElement elementCss(String path) { return
	 * driver.findElement(By.cssSelector(path)); }
	 * 
	 * public static WebElement elementId(String path) { return
	 * driver.findElement(By.linkText(path)); }
	 * 
	 * public static WebElement elementName(String path) { return
	 * driver.findElement(By.name(path)); }
	 * 
	 * public static WebElement driverfindpath(String xpath) { return
	 * driver.findElement(By.xpath(xpath));
	 * 
	 * }
	 * 
	 * public static WebElement driverfindpathbyid(String id) { return
	 * driver.findElement(By.id(id));
	 * 
	 * }
	 * 
	 * public static void driverfind(String path) { elementXpath(path).click(); }
	 * 
	 * public static void sendkeys(String first, String second) {
	 * elementXpath(first).sendKeys(second); }
	 */
	public static void waiting(int time) throws InterruptedException {
		Thread.sleep(time);

	}

}
