package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class TextSearch {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coca Cola");
        element.submit();
        driver.quit();

    }
}
