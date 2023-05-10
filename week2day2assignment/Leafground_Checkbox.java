package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
			
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled());
		
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		
		
		driver.close();


	}

}
