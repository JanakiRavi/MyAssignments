package week7assignment.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewOpportunitySteps extends BaseClass{
 
	
	@And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		
	}
	@Then("HomePage should be displayed")
	public void verifyHomePage() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		if (title.contains("Home")) {
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login not successfull");
		}
	}
	
	@When("Click on toggle menu button from the left corner")
	public void toggleMenu() {
		driver.findElement(By.className("slds-icon-waffle")).click();
	}
	@Then("Click view All and click Sales from App Launcher")
	public void clcikViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("Click on Opportunities tab")
	public void ClickOpportunitiestab() {
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	@And("Click on New button")
	public void ClickNewButton() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	
	
	@Given("Enter Opportunity name as Salesforce Automation by {string}")
	public void EnterOpportunityName(String name) {
		driver.findElement(By.xpath("(//input[@part='input'])[3]")).sendKeys("Salesforce Automation by "+name);
	}
	@When("Choose close date as Today")
	public void closeDate() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='13']")).click();
	}
	@And("Select Stage as Needs Analysis")
	public void stage() {
		driver.findElement(By.xpath("//label[text()='Stage']/following::button")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	@And("Click Save")
	public void ClickSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	
	
	@And("VerifyOppurtunity Name")
	public void VerifyOppurtunity_Name() {
		String text = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(text.contains("janaki"))
			System.out.println("Oppurtunity Name verified");
		else
			System.out.println("Oppurtunity Name not verified");
	}
}
