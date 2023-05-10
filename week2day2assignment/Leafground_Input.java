package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground_Input {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Janaki");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		
		
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		
		WebElement retrive = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String text=retrive.getAttribute("value");
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("janakiravi77@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am Tester with 11 months experience");
		
		driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("Text Editor is working fine");	
		
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String error_msg = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		System.out.println(error_msg);
		
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("Janaki");

		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).sendKeys("Janaki");	
		
       
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-widget')]")).sendKeys("11/07/1998");
		driver.findElement(By.xpath("(//label[text()='Username']/following::input)[3]")).sendKeys("5");
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-c')]")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-c')])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='j_idt106:slider']")).sendKeys("50");
		
		 driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard-input')]")).click();
		 
		System.out.println(driver.findElement(By.xpath("//body[@class='main-body ui-input-filled']/div[4]")).isDisplayed());
		 
		 driver.findElement(By.xpath("(//div[@data-gramm='false'])[2]")).sendKeys("Leafground program");
		  
		 
		 
		 driver.close();
		
		
		
		
		

	}

}
