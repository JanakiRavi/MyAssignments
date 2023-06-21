package week8.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CrossBrowserTesting extends BaseClass{
	@Test
	public void createLEad() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SMR");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("81");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("SMR")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	

}
