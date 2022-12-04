package hm2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonSeleniumTest {

    private final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    private final By CONTINUE_BTN = By.xpath(".//span[@class = 'a-button-inner']");
    private final By SHOP_CONTAINER = By.xpath(".//a [@class = 'nav-a  ']");
    private final By TREE_ITEM = By.xpath(".//div [@role = 'treeitem']/a");
    private final By RIGHT_COLUMN = By.id("gridItemRoot");

    private final String CONTAINER = "Best Sellers";
    private final String ANY_DEPARTMENT = "Books";

    @Test
    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.amazon.de");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.findElement(ACCEPT_COOKIES_BTN).click();
        browser.findElement(CONTINUE_BTN).click();

        List<WebElement> containers = browser.findElements(SHOP_CONTAINER);
        for (WebElement container : containers) {
            if (container.getText().equals(CONTAINER)) {
                wait.until(ExpectedConditions.elementToBeClickable(container));
                container.click();
                break;
            }
        }

        List<WebElement> departments = browser.findElements(TREE_ITEM);
        boolean flag = false;
        for (WebElement department : departments) {
            if (department.getText().equals(ANY_DEPARTMENT)) {
                flag = true;
                wait.until(ExpectedConditions.elementToBeClickable(department));
                department.click();
                break;
            }
        }

        List<WebElement> items = browser.findElements(RIGHT_COLUMN);
        for (int i = 0; i < 3; i++) {
            items.get(3).click();
            break;
        }

        Assertions.assertTrue(flag, "Item not found");
    }
}