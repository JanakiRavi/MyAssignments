package week4day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.OutputType; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//Get the price of the first product
		String price = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("The price of the first product " +price);
		
		price = price.replaceAll("[^0-9.]", "");
		float fpriceResults = Float.parseFloat(price);
		System.out.println(fpriceResults);
		
		//Print the number of customer ratings for the first displayed product
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("the number of customer ratings for the first displayed product :" +rating);
		//Click the first text link of the first image
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));
		// Take a screen shot of the product displayed
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/img.png");
		FileUtils.copyFile(source, destination);
		// Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(4000);
		// Get the cart subtotal and verify if it is correct.
		String priceCart = driver.findElement(By.xpath("//*[@id='attach-accessory-cart-subtotal']")).getText();
		priceCart = priceCart.replaceAll("[^0-9.]", "");
		float fpriceCart = Float.parseFloat(price);
		System.out.println("Price from cart: "+fpriceCart );
		
		if(fpriceResults == fpriceCart)
			System.out.println("Cart subtotal is correct");
		else
			System.out.println("Cart subtotal is incorrect");
		//close the browser
		driver.quit();
	}

}
