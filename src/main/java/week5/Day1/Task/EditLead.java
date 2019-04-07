package week5.Day1.Task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class EditLead extends ProjectMethod {
	@Test(dependsOnMethods= {"week5.Day1.Task.DeleteLead.dLead","week5.Day1.Task.CreateLead.cLead"})
	public void eLead() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("test123@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000); 
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("Edit Lead : " + title); 
		WebElement cmp1 = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		Thread.sleep(1000);
		String text = cmp1.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("Edit Lead - Company Name : " +  text);
		Thread.sleep(500);
		cmp1.clear();
		cmp1.sendKeys("AMD");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(1000);
		WebElement cmp2 = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		String text2 = cmp2.getAttribute("value");
		Thread.sleep(500);
		System.out.println("Edit Lead - Changed Company Name : " + text2);
		
	}

}
