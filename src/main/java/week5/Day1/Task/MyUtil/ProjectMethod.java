package week5.Day1.Task.MyUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week5.Day2.Task.LearnExcel;

public class ProjectMethod {
	String datasheetname="";
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startAPP(String url,String Username,String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(Username);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void CloseApp() {
		driver.close();
	}
	
	@BeforeTest
	public void setData() {
		datasheetname = "MyData";
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		LearnExcel excel = new LearnExcel();
		return excel.learnExcel(datasheetname);



	}
	
	}
	

