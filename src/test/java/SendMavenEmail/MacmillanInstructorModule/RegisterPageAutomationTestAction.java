package SendMavenEmail.MacmillanInstructorModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageAutomationTestAction extends GetPage {

	public static void launch() {
		launchbrowser();
	    getDriver(XpathClass.url);
	}

	public static void signin() throws InterruptedException {
		driverfind(XpathClass.signin);
		waiting(2000);
	}

	public static void createaccount() throws InterruptedException {
		driverfind(XpathClass.createacc);
		waiting(2000);
	}

	public static void details() throws InterruptedException {

		sendkeys(XpathClass.firstname, "test");
		waiting(2000);

		sendkeys(XpathClass.lastname, "demo");
		waiting(2000);

		sendkeys(XpathClass.email, "testdemo160719+04@gmail.com");
		waiting(2000);

		sendkeys(XpathClass.pass, "Password@123");
		waiting(2000);
		sendkeys(XpathClass.confirmpass, "Password@123");
		waiting(2000);
	}

	public static void securityques1() throws InterruptedException {

		WebElement element = driverfindpath(XpathClass.secques1);

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

		driverfind(XpathClass.ques1);

		waiting(2000);

		sendkeys(XpathClass.answer1, "qaz");
		waiting(2000);

	}

	public static void securityques2() throws InterruptedException {

		Select ques2 = new Select(driverfindpathbyid(XpathClass.secques2));
		ques2.selectByVisibleText(XpathClass.vistext2);
		sendkeys(XpathClass.answer2, "qaz");
		waiting(2000);

	}

	public static void securityques3() throws InterruptedException {
		Select ques3 = new Select(driverfindpathbyid(XpathClass.secques3));
		ques3.selectByVisibleText(XpathClass.vistext3);
		sendkeys(XpathClass.answer3, "qaz");
		waiting(2000);

	}

	public static void filldetails() throws InterruptedException {

		sendkeys(XpathClass.college, "Fortis College");
		Thread.sleep(1000);

		driverfind(XpathClass.selectfromdropdown);
		waiting(2000);
	}

	public static void checkboxes() throws InterruptedException {

		WebElement tcCheckbox1 = driverfindpath(XpathClass.checkbox1);
		tcCheckbox1.click();

		WebElement tcCheckbox2 = driverfindpath(XpathClass.checkbox2);

		tcCheckbox2.click();

		driverfind(XpathClass.signup);
		waiting(2000);

	}

}
