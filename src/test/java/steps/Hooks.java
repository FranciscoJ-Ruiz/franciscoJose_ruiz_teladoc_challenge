package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("chromedriver.exe", "C:\\TeladocChallenge\\untitled\\driver");
        driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @AfterStep
    public void addDelay(){
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}