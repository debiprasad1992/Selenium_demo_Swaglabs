package org.swagLabs.Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.SwagLabs.PageObject.CheckoutPage;
import org.SwagLabs.PageObject.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPageStepDef {
    private WebDriver driver;
    private CheckoutPage checkoutPage;
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

    @Then("I should able to place the order successfully")
    public void i_should_able_to_place_the_order_successfully() {
      checkoutPage.checkoutProduct();
    }
}
