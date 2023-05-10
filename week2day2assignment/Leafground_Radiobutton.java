package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Radiobutton {

	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).click();
		
		
		driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
		
		driver.close();

	}

}
