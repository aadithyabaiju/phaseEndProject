package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllRestaurants {

	Actions actions;
	WebDriverWait wait;	
	
	@FindBy(xpath ="//div[contains(@class,'nA6kb')]")
	private WebElement firstRestaurant;
	
	public AllRestaurants(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	

	public void clickfirstRestaurant(){
		wait.until(ExpectedConditions.visibilityOf(firstRestaurant));
		firstRestaurant.click();
			}
}
