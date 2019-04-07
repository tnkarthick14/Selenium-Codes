package week5.Day1.Task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class DeleteLead extends ProjectMethod{
	@Test(priority=2)
	public void dLead() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("test123@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000); 
		WebElement element1 = driver.findElementByXPath("//table[@class='x-grid3-row-table']//a");
		String text1 = element1.getText();
		System.out.println("Delete Lead - Current Lead : " + text1);
		element1.click();
		Thread.sleep(500);
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElementByXPath("//label[text()='Lead ID:']/following::input");
		element2.click();
		element2.sendKeys(text1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000); //
		String text2 = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']//div").getText();
		System.out.println("Delete Lead - Search Results for " + text1 + " : " + text2);
		
		
	}

}
