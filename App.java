import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws Exception {
      System.setProperty("WebDriver.chrome.driver","C:\\Users\\ASUS\\OneDrive\\Desktop\\st_model_lab\\model_lab_st\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement mail= driver.findElement(By.name("email-or-phone"));
        WebElement pass=driver.findElement(By.name("password"));
        WebElement bt=driver.findElement(By.id("join-form-submit"));
        mail.sendKeys("nishithanishitha908@gmail.com");
      Thread.sleep(2000);
      Thread.sleep(2000);
      pass.sendKeys("nishitha@908");
      Thread.sleep(2000);
      bt.click();
      Thread.sleep(5000);
      WebElement firstname= driver.findElement(By.name("first-name"));
      Thread.sleep(2000);
      WebElement lastname= driver.findElement(By.name("last-name"));
      Thread.sleep(2000);
      WebElement subbt=driver.findElement(By.id("join-form-submit"));
      firstname.sendKeys("nishitha");
      lastname.sendKeys("ragu");
      subbt.click();
      Thread.sleep(1000);
      driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"challenge-dialog\"]/div/section/div/div/iframe")));
      WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"register-verification-phone-number\"]")));
      Thread.sleep(5000);
      phone.sendKeys("7603980311"+Keys.ENTER);
      driver.quit();
    }
}