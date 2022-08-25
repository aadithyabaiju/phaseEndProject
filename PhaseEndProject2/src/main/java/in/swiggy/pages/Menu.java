package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {	

	Actions actions;
	WebDriverWait wait;
	
	@FindBy(xpath = "//div[contains(@class,'_1RPOp')][1]")
	private WebElement firstDish;
	
	@FindBy(xpath = "//button[contains(@class,'_1gPB7')]")
	private WebElement checkOut;
	
	public Menu(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void clickFirstDish() {
		wait.until(ExpectedConditions.visibilityOf(firstDish));
		firstDish.click();
	}
	
	public void clickCheckOutButton() {
		wait.until(ExpectedConditions.visibilityOf(checkOut));
		checkOut.click();
		
	}



}
