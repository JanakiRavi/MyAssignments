package week2day2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import java.time.Duration;



public class Leafground_button {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //Click and Confirm title	
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//Confirm if the button is disabled.
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled());
		//Find the position of the Submit button
		System.out.println(driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		//find save button color
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
		//Find the height and width of this button
		
	    System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
		//Mouse over and confirm the color changed
		WebElement mouseover = driver.findElement(By.xpath("(//span[text()='Success']/parent::button[@type='button'])[1]"));
		
		
		//Instantiate Action Class 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(mouseover).perform();
		 
		 System.out.println("Done Mouse hover on Success");
		 
		 
		 //Click Image Button and Click on any hidden button
		 driver.findElement(By.xpath("//span[text()='Image']")).click();
		 //Image isEnable
		 System.out.println(driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).isEnabled());
		 
		 //How many rounded buttons are there?
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("//span[text()='Primary']")).click();
		
		  driver.findElement(By.xpath("//span[text()='Secondary']")).click();
		
		  driver.findElement(By.xpath("(//span[text()='Success'])[2]")).click();
		  
		  driver.findElement(By.xpath("//span[text()='Info']")).click();
		 
		
		
	}

}
