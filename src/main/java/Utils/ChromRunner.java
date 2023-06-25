package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromRunner {
    public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void openChrom(){
        driver.manage().window().maximize();
        driver.get("https://github.com/login");

    }
    @AfterTest
    public void closeChrome(){
        driver.close();
    }
}