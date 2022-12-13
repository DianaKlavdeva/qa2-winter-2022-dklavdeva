package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick ='setLang();']");
    private final By BOOK_BTN = By.id("book2");
    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void typePassengerInfo(String first, String last, String discount,
                                  String adults, String children, String bag) {
        baseFunc.type(FIRST_NAME, first);
        baseFunc.type(LAST_NAME, last);
        baseFunc.type(DISCOUNT, discount);
        baseFunc.type(ADULTS, adults);
        baseFunc.type(CHILDREN, children);
        baseFunc.type(BAG, bag);
    }

    public void selectFlightDate(String valueDate) {
        baseFunc.select(FLIGHT, valueDate);
        baseFunc.click(GET_PRICE_BTN);
        baseFunc.click(BOOK_BTN);
    }
}
