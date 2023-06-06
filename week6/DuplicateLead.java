package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{
	@BeforeTest
	public void setvalues() {
		excelFileName="DuplicateLead";

	}
	
	@Test(dataProvider = "sendData")
	public void runDuplicateLead(String cname,String fname,String lname,String depart,String description,String email,String cname2,String fname2) {
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(depart);
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);

		WebElement element1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec=new Select(element1);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname2);
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname2);
		driver.findElement(By.className("smallSubmit")).click();
	}

}
