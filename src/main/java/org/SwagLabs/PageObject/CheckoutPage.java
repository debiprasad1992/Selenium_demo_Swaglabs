package org.SwagLabs.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckoutPage {
    private WebDriver driver;
    private By checkoutCta = By.xpath("//button[@id='checkout']");
    private By firstNameInputfield = By.xpath("//input[@id='first-name'']");
    private By lastName = By.xpath("//input[@id='last-name']\n");
    private By PostalCode = By.xpath("//input[@id='postal-code']");
    private By Continue = By.xpath("//input[@id='continue']");
    private By Finish = By.xpath("//button[@id='finish']");

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods /Actions on web page
    public void checkoutProduct(){
        WebElement checkout_Cta=driver.findElement(checkoutCta );
        WebElement firstName_Inputfield=driver.findElement(firstNameInputfield );
        WebElement last_Name=driver.findElement(lastName);
        WebElement Postal_Code=driver.findElement(PostalCode );
        WebElement Continue_cta=driver.findElement(Continue );
        WebElement Finish_cta=driver.findElement(Finish );
        checkout_Cta.click();
        firstName_Inputfield.sendKeys("Debi");
        last_Name.sendKeys("Das");
        Postal_Code.sendKeys("754206");
        Continue_cta.click();
        Finish_cta.click();
    }

}











