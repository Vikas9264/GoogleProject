import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.KeyStore;
import java.time.Duration;

public class Google
{
    static WebDriver driver;


    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.co.in");

        WebElement searchTxt=driver.findElement(By.xpath("//*[@name='q']"));
        searchTxt.sendKeys("Vikas Sachdeva");
        searchTxt.sendKeys(Keys.ENTER);

   }
}
