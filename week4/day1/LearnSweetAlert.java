package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSweetAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//enter MS in from
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("MS");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		//enter cape in to
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Cape");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		//to click search button
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//clcik refresh button
		driver.findElement(By.xpath("//span[@class='fa fa-repeat']")).click();
		//click WL and click BOOKNOW button
		driver.findElement(By.xpath("//strong[text()='WL75']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btnDefault train_Search ng-star')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable' and text()='No']")).click();
		
		
		
		
		


	}

}
