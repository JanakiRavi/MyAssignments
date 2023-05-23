package week4day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Go to Mens Fashion
		WebElement menfashion = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(menfashion).perform();
		// Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		// Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println("count of the sports shoes :" +count);
		//Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		// Sort by Low to High
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(3000);
		// Check if the items displayed are sorted correctly
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		 System.out.println("Items Displayed are sorted Successfully:");
		 for (WebElement each : price) {
			System.out.println(each.getText());
		}
		//Filter with color Navy (navy not available,so chosen black)
		 
		 
		 driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		 Thread.sleep(3000);
		 //Select the price range (900-1200)
		 driver.findElement(By.name("fromVal")).sendKeys("900");
		 driver.findElement(By.name("toVal")).sendKeys("1200");
		 driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		 Thread.sleep(2000);
		 // verify the all applied filters 
		 String filters = driver.findElement(By.className("filters")).getText();
		 System.out.println("Filters applied: " +filters);
		 Thread.sleep(3000);
		 //Mouse Hover on first resulting Training shoes
		 WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		 Actions builder2=new Actions(driver);
		 builder2.moveToElement(shoe).perform();
		 //click QuickView button
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		 // Print the cost and the discount percentage
		 String price2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		 System.out.println("Price of the shoe:"+price2);
		 String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		 System.out.println("Discount:"+discount);
		 Thread.sleep(3000);
		 // Take the snapshot of the shoes.

		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File destination = new File("./screenshot/shoe.png");
		 FileUtils.copyFile(source, destination);
		 // Close the current window
		 driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'] )[3]")).click();
		 
		 // Close the main window
         driver.quit();
		 
		
	}

}
