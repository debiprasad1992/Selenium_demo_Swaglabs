package org.SwagLabs.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductsPage {
    private WebDriver driver;
    //By Locators
    private By productsText =By.xpath("//*[text()='Products']");
    private By product_bagpack=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By product_onesie=By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");

    private By cartContainer=By.xpath("//div[@id='shopping_cart_container']");

    //Constructor declaration
    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods /Actions on web page
    public void ValidateProductPage(){
        WebElement emailInput=driver.findElement(productsText );
        String producttext=emailInput.getText();
        System.out.println(producttext);
        Assert.assertEquals("Products",producttext);
    }
    public void addProductToCart(){
        WebElement productBagpack=driver.findElement(product_bagpack);
        WebElement productOnesie=driver.findElement(product_onesie);
        productBagpack.click();
        productOnesie.click();
        WebElement CartContainer=driver.findElement(cartContainer);
        CartContainer.click();
    }
   public void ValidateCartPage(){
       String url=driver.getCurrentUrl();
       Assert.assertTrue(url.contains("cart.html"));
    }


}
