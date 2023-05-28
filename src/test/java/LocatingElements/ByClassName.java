package LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement SignInButton = driver.findElement(By.className("hide_xs"));
        SignInButton.click();
        WebElement EmailAddress = driver.findElement(By.className("account_input"));
        EmailAddress.sendKeys("test@test.com");
        WebElement CreateAnAccount = driver.findElement(By.id("SubmitCreate"));
        CreateAnAccount.click();
    }
}
