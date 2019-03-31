package week4.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar2Max {

	public static void main(String[] args) throws InterruptedException {
		// Set System Property to know which drive used 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Launches the Chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Maximizes the window 
		driver.manage().window().maximize();

		// Navigates to the URL 
		driver.navigate().to("https://www.zoomcar.com/chennai ");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		// //div[text()[contains(., 'Kodambakkam')]]
		driver.findElementByXPath("//div[text()[contains(., 'Kodambakkam')]]").click();
		Thread.sleep(500);

		// //button[text()='Next']
		driver.findElementByXPath("//button[text()='Next']").click();

		// (//div[text()='Select a month']/following::div)[3]
		
		Thread.sleep(1000);

		//driver.findElementByXPath("(//div[text()='Select a month']/following::div)[3]").click();

		// (//div[@class='days']/div)[2]
		
		//Thread.sleep(500);
		String Value1 = driver.findElementByXPath("(//div[@class='days']/div)[2]").getText().replaceAll("\\D", "");
		System.out.println(Value1);
		driver.findElementByXPath("(//div[@class='days']/div)[2]").click();
		Thread.sleep(500);

		// //button[text()='Next']
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Thread.sleep(1000);
		
		//Verify Date : (//div[@class='days']/div)[1]
		
		String Value2 = driver.findElementByXPath("(//div[@class='days']/div)[1]").getText().replaceAll("\\D", "");
		System.out.println(Value2);
		if (Value1.equals(Value2) )
			System.out.println("This is the Chosen date");
		else
			System.out.println("This is not the chosen date");
		
		
		//Click on Done :  //button[text()='Done']
		driver.findElementByXPath("//button[text()='Done']").click();
		
		Thread.sleep(4000);
		
		//return the webelements : //div[@class='car-list-layout']/div
		
		List<WebElement> ElementList = driver.findElementsByXPath("//div[@class='price']");
		System.out.println("The Displayed Results Count " + ElementList.size());
		List<Integer> ls = new ArrayList<>();
	
		for (WebElement webElement : ElementList) {
			String replaceAll = webElement.getText().replaceAll("\\D", "");
			int int1 = Integer.parseInt(replaceAll);
			ls.add(int1);
			System.out.println(int1);
		}
		
		Integer max = Collections.max(ls);
		int frequency1 = Collections.frequency(ls, max);
		System.out.println("Max Price Occurance  :" + frequency1);
		System.out.println("MAX price :" + max);
		for (int i=1 ;i<=frequency1;i++)
		{
		WebElement Element2 = driver.findElementByXPath("(//div[contains(text(),'"+max+"')])["+i+"]/../../preceding-sibling::div/h3");
		String Brand = Element2.getText();
		System.out.println("Brand Name : " + Brand);
		}
		
		driver.findElementByXPath("((//div[contains(text(),'"+max+"')])[1]/following::button)[1]").click();
		Thread.sleep(2000);
		
		driver.close();
		


	}	


}
