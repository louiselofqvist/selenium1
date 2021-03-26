package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
  @Test
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Louise\\Pictures\\Skola\\chromedriver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver(); //starta chrome
    driver.get("http://www.google.com/"); //navigera till google.com
    Thread.sleep(5000);                   //v�nta i 5 sekunder
    WebElement searchBox = driver.findElement(By.name("q")); //hitta s�kf�ltet
    searchBox.sendKeys("ChromeDriver"); //skriva in chromedriver i s�kf�ltet
    searchBox.submit(); //skicka data som finns i s�kf�ltet 
    Thread.sleep(5000);  //v�nta i 5 sekunder
    driver.quit(); //st�nga ner chrome
  }
}
