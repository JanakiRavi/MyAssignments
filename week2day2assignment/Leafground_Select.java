package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground_Select {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
 
		Select sec=new Select(tool);
		sec.selectByIndex(1);
		
		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		driver.findElement(By.xpath("//label[text()='Select Language']/parent::div")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		driver.close();
		
		
	}

}
