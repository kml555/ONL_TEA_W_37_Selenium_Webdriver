package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NoweKarty {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(2000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }
}
