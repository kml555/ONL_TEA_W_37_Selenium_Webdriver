package TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MetodyNawigacyjne {
    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
