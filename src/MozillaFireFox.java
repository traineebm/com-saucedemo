import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MozillaFireFox {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver-v0.30.0-win64/geckodriver.exe");
        WebDriver d = new FirefoxDriver();
        d.get(baseUrl);
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = d.getTitle();
        System.out.println(title);

        System.out.println("Current Url = " + d.getCurrentUrl());
        String loginUrl = "https://www.saucedemo.com/";
        d.navigate().to(loginUrl);
        System.out.println("Current Url = " + d.getCurrentUrl());

        WebElement usernameField = d.findElement(By.id("user-name"));
        usernameField.sendKeys("arrow123");

        WebElement passwordField = d.findElement(By.name("password"));
        passwordField.sendKeys("abc8909");
        d.close();
    }
}
