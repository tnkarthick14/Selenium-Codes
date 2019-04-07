package week5.Day1.Task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class DuplicateLead extends ProjectMethod {
	@Test
	public void dupLead() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("test123@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000); 
		//String text1 = driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").getText();
		// System.out.println("Current Lead : " + text1);
		WebElement element1 = driver.findElementByXPath("//table[@class='x-grid3-row-table']//a");
		String text1 = element1.getText();
		WebElement element2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
		String text2 = element2.getText();
		System.out.println("Duplicate Lead - Current Lead : " + text1 + "\t" + text2); 
		element1.click();
		//a[text()='Delete']
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(2000);
		WebElement element3 = driver.findElementByXPath("//div[text()='Duplicate Lead']");
		String text3 = element3.getText();
		System.out.println("Duplicate Lead - Title is : " + text3);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		WebElement element4 = driver.findElementByXPath("(//span[text()='First name']/following::span)[1]");
		String text4 = element4.getText();
		System.out.println("Duplicated Lead : " + text4); 
		int compareName = text2.compareTo(text4);
		if(compareName==0)
		{
			System.out.println("The duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("The duplicated lead name is same as captured name");
		}

	}

}
