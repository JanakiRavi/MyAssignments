package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
       

        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Janaki");
        driver.findElement(By.id("lastNameField")).sendKeys("R");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Janu");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mahesh");
        
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Tester");
        driver.findElement(By.id("createContactForm_description")).sendKeys("Automation testing");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("janakiravi77@gmail.com");
        
        
        WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select sec=new Select(element1);
        sec.selectByVisibleText("New York");
        
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Fill the ImportantNote Field");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        
       System.out.println(driver.getTitle());
        
        
        
     

	}

}
