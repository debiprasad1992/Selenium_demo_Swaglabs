package org.SwagLabs.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
private WebDriver driver;
//By Locators
    private By emailInputfield =By.xpath("//input[@id='user-name']");
    private By passwordInputfield =By.xpath("//input[@id='password']");
    private By loginCta =By.xpath("//input[@id='login-button']");


    //Constructor declaration
    public Loginpage(WebDriver driver){
        this.driver=driver;
    }
    //Methods /Actions on web page
    public void enterEmail(String email){
        WebElement emailInput=driver.findElement(emailInputfield);
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        WebElement passwordInput=driver.findElement(passwordInputfield);
        passwordInput.sendKeys(password);

    }
    public void clickLoginCTA(){
        WebElement passwordInput=driver.findElement(loginCta);
        passwordInput.click();

    }
}
