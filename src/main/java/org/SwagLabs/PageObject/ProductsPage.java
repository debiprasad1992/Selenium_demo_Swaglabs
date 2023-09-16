package org.SwagLabs.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductsPage {
    private WebDriver driver;
    //By Locators
    private By productsText =By.xpath("//*[text()='Products']");

    //Constructor declaration
    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods /Actions on web page
    public void ValidateProductPage(){
        WebElement emailInput=driver.findElement(productsText );
        String producttext=emailInput.getText();
        System.out.println(producttext);
        Assert.assertEquals("Productsggggggggggg",producttext);
    }
}
