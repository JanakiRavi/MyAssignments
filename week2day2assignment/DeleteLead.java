package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
       

        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7397597078");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);      
        driver.findElement(By.xpath("//a[@class='linktext' and text()='13094']")).click();
        
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        
        driver.findElement(By.name("id")).sendKeys("13094");
        driver.findElement(By.linkText("Find Leads")).click();
        Thread.sleep(3000);  
        String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
        String expectedText="No records to display";
        if(text.equals(expectedText))
        	System.out.println("Test case passed");
        else
        	System.out.println("Test case failed");
        driver.close();
        
        
      
	}

}
