package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//*[@aria-label='bags for boys']")).click();
		
		String text = driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']")).getText();
		text=text.substring(text.indexOf("over"));
		System.out.println(text=text.replaceAll("[^0-9]","" ));
		
		
		driver.findElement(By.xpath("(//span[text()='American Tourister'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='Safari']")).click();
		
		
		
		
		driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		Thread.sleep(2000);
		String bagname = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
		System.out.println("Bagname:"+bagname);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price:"+price);
		String discount = driver.findElement(By.xpath("//span[@class='a-letter-space']/following-sibling::span")).getText();
		System.out.println("Discount:"+discount);
		System.out.println(driver.getTitle());
	}

}
