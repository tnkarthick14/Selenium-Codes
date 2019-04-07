package myUtils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class ProjectMethods {
	public ChromeDriver driver;
	@BeforeTest
	@Parameters({"url","username","password"})
	public void StartApp(String url,String usr,String pwd) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//"http://leaftaps.com/opentaps"
		driver.get(url);
		driver.manage().window().maximize();
		//"DemoSalesManager"
		driver.findElementById("username").sendKeys(usr);
		//"crmsfa"
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

}
