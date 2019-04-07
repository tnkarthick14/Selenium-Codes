package week5.Day1.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class MergeLeadBase4 extends ProjectMethod {
	@Test()
	//dependsOnMethods= {"week5.Day1.Task.DeleteLead.dLead","week5.Day1.Task.CreateLead.cLead","week5.Day1.Task.DuplicateLead.dupLead","week5.Day1.Task.EditLead.eLead"}
	public void mLead() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']/following::img").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls = new ArrayList<>();
		ls.addAll(windowHandles);
		driver.switchTo().window(ls.get(1));
		Thread.sleep(500);
		System.out.println("Merge Lead Title - From ID : " + driver.getTitle());
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("(//label[text()='Email Address:']/following::input)[1]").sendKeys("test123@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement Element1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text1 = Element1.getText();
		Element1.click();
		Thread.sleep(2000);
		driver.switchTo().window(ls.get(0));
		driver.findElementByXPath("//input[@id='ComboBox_partyIdTo']/following::img").click();
		windowHandles.addAll(driver.getWindowHandles());
		ls.clear();
		ls.addAll(windowHandles);
		Thread.sleep(2000);
		driver.switchTo().window(ls.get(2));
		Thread.sleep(500);
		System.out.println("Merge Lead Title - To ID : " + driver.getTitle());
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("(//label[text()='Email Address:']/following::input)[1]").sendKeys("test123@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
		Thread.sleep(500);
		driver.switchTo().window(ls.get(0));
		Thread.sleep(500);
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(text1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(500);
		System.out.println("Leads Merged : " + driver.findElementByXPath("(//table[@class='x-btn-wrap x-btn x-btn-text-icon']/following::div)[1]").getText());
	


	}

}
