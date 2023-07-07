package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps {
	

	

@When("add product into the cart from PDP")
public void add_product_into_the_cart_from_pdp() {
  System.out.println("PDP");
}

@Then("Validate user is able to add the product")
public void validate_user_is_able_to_add_the_product() {
   System.out.println("Validation cart");
}

@When("add product into the cart from PLP")
public void add_product_into_the_cart_from_plp() {
System.out.println("add to cart PLp");
}




}
