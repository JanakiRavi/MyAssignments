package week7assignment.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;
import io.cucumber.java.en.*;

public class CreateAccounts extends BaseClass{
    @When("Click on Accounts tab")
    public void ClickAccounts() {
    	WebElement ele = driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
    }
    @Then("Click on New Account button") 
    public void newAccountButton() {
    	driver.findElement(By.xpath("//div[@title='New']")).click();
    }
    @Given("Enter {string} as account name") 
    public void accountName(String name) {
    	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
    }
    @And("Select Ownership as Public")
    public void ownership() {
    	//WebElement scrollele = driver.findElement(By.xpath("//label[text()='Ownership']/following::button"));
    	//String text = scrollele.getText();
    	//System.out.println(text);
//    	Actions builder=new Actions(driver);
//    	builder.scrollToElement(scrollele).perform();
//    	scrollele.click();
    	WebElement ele = driver.findElement(By.xpath("//label[text()='Ownership']/following::button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
    }
    @When("Click saveOption")
    public void saveOption() {
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
    @Then("verify Account name")
    public void verifyAccountName() {
    	String accountName = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']")).getText();
    	if(accountName.contains("Janaki"))
    		System.out.println("Account name verified");
    	else
    		System.out.println("Account name not verified");
    }
}
