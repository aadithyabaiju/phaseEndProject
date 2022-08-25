package in.swiggy.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import in.swiggy.pages.AllRestaurants;
import in.swiggy.pages.CheckoutPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.Menu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodOnlineSteps {

	WebDriver driver;
	
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");	    
	}

	@When("he enter ‘Bangalore, Karnataka, India’ in the search box")
	public void he_enter_bangalore_karnatka_india_in_the_search_box() {
	   LandingPage landingPage =new LandingPage(driver);
	   landingPage.enterDeliveryLocation();
	  
	 	
	   
	}

	@When("he clicks on ‘Bangalore, Karnataka, India’ in the option")
	public void he_clicks_on_bangalore_karnataka_india_in_the_option() throws InterruptedException {
		LandingPage landingPage =new LandingPage(driver);
		landingPage.clickdeliveryLocation();	
	    
	}

	@When("he clicks on the first restaurant on the next page")
	public void he_clicks_on_the_first_restaurant_on_the_next_page(){
		AllRestaurants allRestaurants = new AllRestaurants(driver);
		allRestaurants.clickfirstRestaurant();

	}

	@When("he clicks on Add on the first item of the restaurant page")
	public void he_clicks_on_add_on_the_first_item_of_the_restaurant_page(){
	    Menu menu = new Menu(driver);
	    menu.clickFirstDish();
	}

	@When("he clicks on Checkout button")
	public void he_clicks_on_checkout_button() {
		   Menu menu = new Menu(driver);
		   menu.clickCheckOutButton();	    
	}

	@Then("he must be able to order food successfully")
	public void he_must_be_able_to_order_food_successfully() {
		CheckoutPage checkOutPage = new CheckoutPage(driver);
		String expectedTitle ="SECURE CHECKOUT";
		String actualTitle = checkOutPage.verifySecureCheckOut();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	    
	}


}
