package org.swagLabs.Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.SwagLabs.PageObject.Loginpage;
import org.SwagLabs.PageObject.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDef {
    private WebDriver driver;
    private Loginpage loginpage;
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
    @Given("I am on the swagLab login page")
    public void i_am_on_the_swag_lab_login_page() {
        driver.get("https://www.saucedemo.com/");
        loginpage=new Loginpage(driver);
        productsPage= new ProductsPage(driver);
    }
    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
      loginpage.enterEmail("standard_user");
      loginpage.enterPassword("secret_sauce");
    }
    @When("I click on the login CTA")
    public void i_click_on_the_login_cta() {
        loginpage.clickLoginCTA();
    }
    @Then("I should be loggedin to my account sucessfully")
    public void i_should_be_loggedin_to_my_account_sucessfully() {
        productsPage.ValidateProductPage();

    }
}
