package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPageSteps {
	
	
	@Given("user launch site URL")
	public void user_launch_site_url() {
	   System.out.println("Launch URL");
	}

	@When("user login into the application")
	public void user_login_into_the_application() {
	     System.out.println("Login");
	}

	@When("add product into the cart and navigate to checkout page")
	public void add_product_into_the_cart_and_navigate_to_checkout_page() {
	  System.out.println("add to cart");
	}
	@When("user select card payment method and enter all valid deatils")
	public void user_select_card_payment_method_and_enter_all_valid_deatils() {
	   System.out.println("payment");
	}

	@Then("Validate succesful payment by card")
	public void validate_succesful_payment_by_card() {
	  System.out.println("Validation");
	}


}
