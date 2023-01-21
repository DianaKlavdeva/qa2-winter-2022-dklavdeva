package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;

import java.util.List;

public class SeatsPage {
    private final By SEATS = By.xpath(".//div[@class = 'seat']");
    private final By SELECTED_SEAT = By.xpath(".//div[@class = 'line']");
    private final By BOOK_FLIGHT_END_BTN = By.id("book3");

    private BaseFunc baseFunc;

    public SeatsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickSeatNumber(int seatNr) {
        baseFunc.waitForMinElementsAmount(SEATS, 30);

        List<WebElement> seats = baseFunc.findElements(SEATS);

        boolean isSeatFound = false;
        for (WebElement we : seats) {
            if (Integer.parseInt(we.getText()) == seatNr) {
                baseFunc.click(we);
                isSeatFound = true;
                break;
            }
        }
        Assertions.assertTrue(isSeatFound, "Seat Nr. " + seatNr + " isn't found");
    }

    public int getSelectedSeatNr() {
        String selectedSeatInfo = baseFunc.findElement(SELECTED_SEAT).getText();
        return Integer.parseInt(StringUtils.getDigits(selectedSeatInfo));
    }

    public void bookEnd(){
        baseFunc.click(BOOK_FLIGHT_END_BTN);
    }
}
