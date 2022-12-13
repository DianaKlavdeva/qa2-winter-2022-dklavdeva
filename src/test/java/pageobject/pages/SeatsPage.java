package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;

import java.util.List;

public class SeatsPage {
    private BaseFunc baseFunc;

    private final By SEATS = By.xpath(".//div[@class = 'seat']");
    private final By BOOK_FLIGHT_END = By.id("book3");

    public SeatsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
     public void clickSeatNumber (String seat) {
        baseFunc.clickElement(SEATS, seat);
        baseFunc.click(BOOK_FLIGHT_END);
     }

}
