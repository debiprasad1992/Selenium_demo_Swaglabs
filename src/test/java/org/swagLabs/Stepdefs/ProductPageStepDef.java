package org.swagLabs.Stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.SwagLabs.PageObject.Loginpage;
import org.SwagLabs.PageObject.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProductPageStepDef {
    private WebDriver driver;
    private ProductsPage productsPage;
    @Before
    public void setup(){
        driver=new ChromeDriver();
    }
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @When("I should be able to add prodcuts to cart for checkout")
    public void i_click_on_the_login_cta() {
        productsPage.addProductToCart();
    }
    @Then("I should land on the cart page with the products added")
    public void i_should_be_loggedin_to_my_account_sucessfully() {
        productsPage.ValidateCartPage();

    }
}
