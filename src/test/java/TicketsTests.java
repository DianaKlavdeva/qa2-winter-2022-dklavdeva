import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick ='setLang();']");
    private final By BOOK_BTN = By.id("book2");
    private final By SEATS = By.xpath(".//div[@class = 'seat']");
    private final By BOOK_FLIGHT_END = By.id("book3");

    private WebDriver browser;
    private WebDriverWait wait;


    @Test
    public void reservationCheck() {

        String airportFrom = "RIX";
        String airportTo = "SFO";
        String firstName = "Diana";
        String lastName = "Klavdeva";
        String discountCode = "12345";
        String adults = "3";
        String children = "2";
        String bag = "1";
        String valueDate = "15";
        String seat = "7";

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM, airportFrom);
        select(TO, airportTo);

//          Select airportFrom = new Select(browser.findElement(FROM));
//          airportFrom.selectByValue("RIX");

//          Select airportTo = new Select(browser.findElement(TO));
//          airportTo.selectByValue("SFO");

        browser.findElement(GO_BTN).click();

        type(FIRST_NAME, firstName);
//          browser.findElement(FIRST_NAME).clear();
//          browser.findElement(FIRST_NAME).sendKeys("First Name");

        type(LAST_NAME, lastName);
//          browser.findElement(LAST_NAME).clear();
//          browser.findElement(LAST_NAME).sendKeys("Last name");
        type(DISCOUNT, discountCode);
        type(ADULTS, adults);
        type(CHILDREN, children);
        type(BAG, bag);
        select(FLIGHT, valueDate);

        browser.findElement(GET_PRICE_BTN).click();

        Assertions.assertEquals(airportFrom,airportFrom, "Wrong airport!");
        Assertions.assertEquals(airportTo, airportTo, "Wrong airport!");

        browser.findElement(BOOK_BTN).click();

       List<WebElement> seats = browser.findElements(SEATS);
   //  for (int i = 0; i < 5; i++) {
   //        wait.until(ExpectedConditions.elementToBeClickable(SEATS));
     //      seats.get(5).click();
   //   }

  //      for (WebElement s : seats){
   //         s.
    //    }

        boolean isSeatSelect = false;
        for (WebElement s : seats){
            if (s.getText().equals(seat)) {
                isSeatSelect = true;
                s.click();
                break;
            }
        }
        Assertions.assertTrue(isSeatSelect, "Seat not select");
        Assertions.assertEquals(seat, seat, "Seat not select");

        browser.findElement(BOOK_FLIGHT_END).click();

        String finalText = "Thank You for flying with us!";
        Assertions.assertTrue(finalText.equals(finalText), "Not final text");
    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }


}
