package SendMavenEmail.MacmillanInstructorModule;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageAutomationTestAction extends GetPage {

	public static void launch() throws IOException {
		launchbrowser();
	    getDriver("https://" + yamlReader.readingDataFromYamlFile("url"));
	}

	public static void signin() throws InterruptedException {
		TxtFileRead.getElement(driver, "signin", "Data.txt").click();
		waiting(2000);
	}

	public static void createaccount() throws InterruptedException {
		TxtFileRead.getElement(driver, "createacc", "Data.txt").click();
		waiting(2000);
	}

	public static void details() throws InterruptedException {
		
		final SimpleDateFormat simpledate = new SimpleDateFormat("yyyyMMdd.HHmmss");
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		TxtFileRead.getElement(driver, "firstname", "Data.txt").sendKeys("testdemo" );
		waiting(2000);

		TxtFileRead.getElement(driver, "lastname", "Data.txt").sendKeys("demo");
		waiting(2000);

		String id = "testdemo"  + simpledate.format(timestamp) + "@gmail.com";
		TxtFileRead.getElement(driver, "email", "Data.txt").sendKeys(id);
		waiting(2000);
		
		 csvWrite.abc(id);
		
		
		
		TxtFileRead.getElement(driver, "pass", "Data.txt").sendKeys("Password@123");
		waiting(2000);
		TxtFileRead.getElement(driver, "confirmpass", "Data.txt").sendKeys("Password@123");
		waiting(2000);

	}

	public static void securityques1() throws InterruptedException {

		WebElement element = TxtFileRead.getElement(driver, "secques1", "Data.txt");

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

		TxtFileRead.getElement(driver, "ques1", "Data.txt").click();

		waiting(2000);
		TxtFileRead.getElement(driver, "answer1", "Data.txt").sendKeys("qaz");
		waiting(2000);

	}

	public static void securityques2() throws InterruptedException, IOException {

		Select ques2 = new Select(TxtFileRead.getElement(driver, "secques2", "Data.txt"));
		ques2.selectByVisibleText(yamlReader.readingDataFromYamlFile("vistext2"));
		TxtFileRead.getElement(driver, "answer2", "Data.txt").sendKeys("qaz");
		waiting(2000);

	}

	public static void securityques3() throws InterruptedException, IOException {

		Select ques3 = new Select(TxtFileRead.getElement(driver, "secques3", "Data.txt"));
		ques3.selectByVisibleText(yamlReader.readingDataFromYamlFile("vistext3"));
		TxtFileRead.getElement(driver, "answer3", "Data.txt").sendKeys("qaz");
		waiting(2000);
	}

	public static void filldetails() throws InterruptedException {

		TxtFileRead.getElement(driver, "college", "Data.txt").sendKeys("Fortis College");
		Thread.sleep(1000);

		TxtFileRead.getElement(driver, "selectfromdropdown", "Data.txt").click();
		waiting(2000);
	}

	public static void checkboxes() throws InterruptedException {

		WebElement tcCheckbox1 = TxtFileRead.getElement(driver, "checkbox1", "Data.txt");
		tcCheckbox1.click();

		WebElement tcCheckbox2 = TxtFileRead.getElement(driver, "checkbox2", "Data.txt");
		tcCheckbox2.click();

		TxtFileRead.getElement(driver, "signup", "Data.txt").click();
		waiting(2000);

	}

}
