package week4day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        //parent window
        String pwindow = driver.getWindowHandle();
        //all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        int size = windowHandles.size();
        System.out.println("Size of window :"+size);
        //convert set to list , use get method to switch to first window
        
        List<String> handles=new ArrayList<String>(windowHandles);
        driver.switchTo().window(handles.get(1));
        
        
        driver.findElement(By.xpath("//a[@class='linktext' and text()='Firstname']")).click();
        
        driver.switchTo().window(pwindow);//switch back to parent
        
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        String pwindow2 = driver.getWindowHandle();
        Set<String> windowHandles2 = driver.getWindowHandles();
        int size2 = windowHandles2.size();
        System.out.println(size2);
        
       //convert set to list , use get method to switch to first window
        
        List<String> handles2=new ArrayList<String>(windowHandles2);
        driver.switchTo().window(handles2.get(1));
        driver.findElement(By.name("firstName")).sendKeys("Janaki");
       
        driver.findElement(By.xpath("//a[@class='linktext' and text()='1']")).click();
        
        driver.switchTo().window(pwindow2);//switch back to parent
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
        driver.switchTo().alert().accept();
        String title = driver.getTitle();
        String excepted="View Contact";
        if(title.contains(excepted))
        	System.out.println("Title is verfied");
        else
        	System.out.println("Title is not correct");
        
        
	}

}
