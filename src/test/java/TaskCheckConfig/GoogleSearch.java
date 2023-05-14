package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GoogleSearch {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/drivers/chromedriver"); // Chrome - ustawienie property systemowego - obecnie nie trzeba tego ustawiać

        WebDriver driver = new SafariDriver(); // tworzymy obiek drivera - wybieramy przglądarkę z którą chcemy pracować
        driver.manage().window().maximize(); // maksymalizacja okna przeglądarki
        driver.get("http://www.google.com"); // wpisujemy adres do przeglądarki
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); // wyszukanie elementu "Zaakceptuj wszystko" na stronie"
        acceptCookiesButton.click(); // klikamy w przycisk "Zaakceptuj wszystko"
        WebElement element = driver.findElement(By.name("q")); // wyszukuję element search bar na stronie
        element.clear(); // usuwamy napisy z pola search bar
        element.sendKeys("Coderslab"); // przesyłamy napis "Coderslab" do search bar'a
        element.submit(); // akceptujemy formularz, wyszukujemy hasło w Google
//        Thread.sleep(5000); // robi pauze na 5s
        driver.quit(); // zamykamy wszystkie okna przegladarki
    }
}