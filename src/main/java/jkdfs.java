
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jkdfs {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://pokupon.ua/en");
        WebElement login = webDriver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
        login.clear();
        login.click();
        login.sendKeys("Sushi");
        login.sendKeys(Keys.ENTER);
    }
}
