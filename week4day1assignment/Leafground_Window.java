package week4day1assignment;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class Leafground_Window {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String pTitle = driver.getTitle();
		
		//to get  a single window handle
		String pWindowHandle = driver.getWindowHandle();
		
		//to get the handles of allwindows opened
		Set<String> windowHandles = driver.getWindowHandles();
		//to get particular window Handle, convert Set into List
		List<String> handles = new ArrayList<String>(windowHandles);
	    //using list switch to the particular window
		driver.switchTo().window(handles.get(1));
		//get the title of the child window
		String cTitle = driver.getTitle();

		if(pTitle!=cTitle)
			System.out.println("New window opened.");
		else
			System.out.println("New window not opened");
		//to switch back to parent window
		driver.switchTo().window(pWindowHandle);
		
           
		//Find the number of opened tabs
		String parent2 = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		//to get particular window Handle, convert Set into List
		List<String> handles2 = new ArrayList<String>(windowHandles2);
		int size = handles2.size();
		System.out.println("The number of opened tabs:"+size);
		
		//switch back to parent
		driver.switchTo().window(parent2);
		
		//to close all windows except primary
		//get the parentwindowhandle
				String parentWindowHandle = driver.getWindowHandle();
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				//to get all the window handles
				Set<String> windowHandles3 = driver.getWindowHandles();
				
				List<String> handles3 = new ArrayList<String>(windowHandles3);
				for (String eachHandle : handles3) {
					if (!eachHandle.equals(parentWindowHandle)) {
						driver.switchTo().window(eachHandle).close();
					}
				}
				driver.switchTo().window(parentWindowHandle);
				//Wait for 2 new tabs to open
				String parent3 = driver.getWindowHandle();
				driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
				Thread.sleep(5000);
				Set<String> openstabs = driver.getWindowHandles();
				List<String> tabs=new ArrayList<String>(openstabs);
				int newtabs = tabs.size();
				System.out.println("New tabs opend :" +newtabs);
				
				Thread.sleep(3000);
				driver.quit();
				
	}

}
