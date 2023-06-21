package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leaftaps {
	public ChromeDriver driver;
	@BeforeTest
	public void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Test
	public void createLead() {
		  driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
			driver.findElement(By.id("createLeadForm_firstNam")).sendKeys("Janu");// to fail the test in purpose
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Janaki");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("91");
			driver.findElement(By.name("submitButton")).click();
	  }
	  @Test
	  public void editLead() throws InterruptedException {
		  driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
			companyName.clear();
			companyName.sendKeys("Infosys");
			driver.findElement(By.name("submitButton")).click();
	  }
	  @AfterTest
	  public void close() {
		  driver.close();
	  }
	  

}
