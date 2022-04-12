import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicrosoftEdge {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","Drivers/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current Url = " + driver.getCurrentUrl());
        String loginUrl = "https://www.saucedemo.com/";
        driver.navigate().to(loginUrl);
        System.out.println("Current Url = " + driver.getCurrentUrl());

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("arrow123");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("abc8909");
        driver.close();
    }
}
