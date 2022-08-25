package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id ="location")
	private WebElement enterDeliveryLocation;
	

	
	@FindBy(xpath ="//span[contains(@class,'_2W-T9')]")
	private WebElement deliveryLocation;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void enterDeliveryLocation() {
		enterDeliveryLocation.sendKeys("Bangalore, Karnataka, India");	
		
	}
	
	public void clickdeliveryLocation() throws InterruptedException {
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(deliveryLocation));
		deliveryLocation.click();
	}

}
