package week4day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// mouseover Brands
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		//Search L'Oreal Paris
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(3000);
		//Click L'Oreal Paris
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		//Check the title contains L'Oreal Paris
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
			System.out.println("Ttile is correct");
		else
			System.out.println("Title is wrong");

		//Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(3000);
		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(3000);
		//Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		//check whether the Filter is applied with Shampoo
		String text = driver.findElement(By.xpath("//span[text()='Filters Applied']")).getText();
		System.out.println(text);
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();

		//GO to the new window and select size as 180ml
		String parentwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));

		driver.findElement(By.xpath("//span[text()='180ml']")).click();

		//Print the MRP of the product
		String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("MRP:"+mrp);
		//Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		//Go to Shopping Bag 
		driver.findElement(By.xpath("(//*[name()='svg' and @fill='none'])[6]")).click();

		//driver.switchTo().frame(1);

		WebElement findElement = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(findElement);

		//Print the Grand Total amount
		String grandtotal = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
		System.out.println("Grand Total amount :"+grandtotal);
		//Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//Check if this grand total is the same in step 14
		String price = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		System.out.println(price);
		//Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@alt='Image']/parent::span)[7]")).click();

		if(price.equals(grandtotal))
			System.out.println("Amount is same");
		else
			System.out.println("Amount differs");
		//Close all windows
		driver.quit();



	}

}
