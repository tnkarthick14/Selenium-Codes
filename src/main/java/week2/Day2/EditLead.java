package week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("test@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000); 
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title); 
		WebElement cmp1 = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		// //span[text()='Company Name']/following::input
		Thread.sleep(1000);
		String text = cmp1.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("Company Name : " +  text);
		Thread.sleep(1000);
		cmp1.clear();
		cmp1.sendKeys("AMD");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		WebElement cmp2 = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		String text2 = cmp2.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("Changed Company Name : " + text2);
		driver.close();
		
		
		
		
		
		
	}

}
