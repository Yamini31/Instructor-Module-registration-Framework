package SendMavenEmail.MacmillanInstructorModule;

public class LoginPageTestAction extends GetPage {

	
	public static void launching() {
		launchbrowser();
		getDriver(XpathClass.url);
	}
	
	public static void signoptionclick() throws InterruptedException
	{
		driverfind(XpathClass.signin);
		waiting(2000);
	}
	
	public static  void username() throws InterruptedException
	{
		sendkeys(XpathClass.user, "testdemo");
		waiting(2000);
	}
	
	public static void password() throws InterruptedException
	{
		sendkeys(XpathClass.passwo, "testdemo");
		waiting(2000);

	}
	public static void loginbtn() throws InterruptedException {
		driverfind(XpathClass.loginbutton);
		waiting(2000);
	}
	
	
	
}
