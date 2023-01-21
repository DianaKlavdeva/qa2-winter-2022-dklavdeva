import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SecondFirefoxSeleniumTest {
        private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
        private final By TOP_LOCATIONS_LINK = By.xpath(".//div[@class = 'tl-box']/a");

        private WebDriver browser;
        private WebDriverWait wait;

        @Test
        public void openHomePageCheck() {
            String country = "Latvia";

            System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
            browser = new FirefoxDriver();
            browser.manage().window().maximize();
            browser.get("http://www.discovercars.com/");

            wait = new WebDriverWait(browser, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
            browser.findElement(ACCEPT_COOKIES_BTN).click();

            clickOnCountry(country);
        }

        private void clickOnCountry(String country) {
            List<WebElement> links = browser.findElements(TOP_LOCATIONS_LINK);

            boolean isCountryFound = false;
            for (WebElement link : links) {
                if (link.getText().equals(country)) {
                    isCountryFound = true;
                    wait.until(ExpectedConditions.elementToBeClickable(link));
                    link.click();
                    break;
                }
            }

            Assertions.assertTrue(isCountryFound, "Country not found!");
        }
    }

