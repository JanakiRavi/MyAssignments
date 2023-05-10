package week2day2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf_DuplicateLead {

	
		
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");

				

				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();



				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				
				
				driver.findElement(By.linkText("Find Leads")).click();
		        driver.findElement(By.linkText("Email")).click();
		        driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("janakiravi77@gmail.com");
		        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		        Thread.sleep(3000);      
		        WebElement element = driver.findElement(By.xpath("//a[@class='linktext' and text()='Janaki']"));
		        element.click();
		        driver.findElement(By.className("subMenuButton")).click();
		        
		       String title = driver.getTitle();
		       String expectedtitle="Duplicate Lead | opentaps CRM";
		       if(title.equals(expectedtitle))
		    	   System.out.println("Title is correct");
		       else
		    	   System.out.println("Title is not correct");
		     
		       driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		       Thread.sleep(2000);
		       
		       String actual_msg = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		       
		       String expected1="Janaki";
		       if(actual_msg.equals(expected1))
		    	   System.out.println("duplicated lead name is same as captured name");
		       else
		    	   System.out.println("duplicated lead name is not same as captured name");
		        
		        
		      driver.close();
			}

		

	}


