package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtSource")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		
		driver.findElement(By.id("txtDestination")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		
		driver.findElement(By.id("txtOnwardCalendar")).click();
		driver.findElement(By.xpath("(//span[text()='12'])[2]")).click();
		

		driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//span[text()='102']")).getText());
		
		options.addArguments("--disable-notifications");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//span[text()='84']")).getText());
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
