package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestMts {

    WebDriver driver;

    @BeforeAll
    public static void init1(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.mts.by/");
        WebElement butoon = driver.findElement(By.xpath("//*[text()='Принять']"));
        butoon.click();
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void someInfo()  {
        driver.get("https://www.mts.by/");
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@class='pay']//h2")).getText(),"Онлайн пополнение\nбез комиссии");
    }
    @Test
    public void verifyAssertTrue() {


        String[] paymentLogos = {
                "img[alt='Visa']",
                "img[alt='Verified By Visa']",
                "img[alt='MasterCard']",
                "img[alt='MasterCard Secure Code']",
                "img[alt='Белкарт']"

        };

        driver.get("https://www.mts.by/");

        try {

            for (String logo : paymentLogos) {
                WebElement logoElement = driver.findElement(By.cssSelector(logo));
                Assert.assertTrue(logoElement.isDisplayed(), "Логотипы не найдены: " + logo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testAbout() {
        driver.get("https://www.mts.by/");
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Подробнее о сервисе']")));
        element.click();
    }
    @Test
    public void testNumber() {
        driver.get("https://www.mts.by/");
        WebElement input = driver.findElement(By.xpath("//*[@class='phone']"));
        input.sendKeys("297777777");
        WebElement div = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        div.sendKeys("100");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        button.click();
    }
    @Test
    public void testSwitch() {
        driver.get("https://www.mts.by/");
        WebElement input = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='select_header']")));
        input.click();
        WebElement button = driver.findElement(By.xpath("//*[text()='Домашний интернет']"));
        button.click();
    }
}