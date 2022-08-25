package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	
	WebDriverWait wait;
	
	@FindBy(xpath = "//span[contains(@class,'_2EQ3T')]")
	private WebElement secureCheckOut;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public String verifySecureCheckOut() {
		wait.until(ExpectedConditions.visibilityOf(secureCheckOut));
		String title = secureCheckOut.getText();
		return title;
	}

}
