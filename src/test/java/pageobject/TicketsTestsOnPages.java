package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPages;

public class TicketsTestsOnPages {
    private final String URL = "qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";

    private BaseFunc baseFunc  = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPages infoPages = new PassengerInfoPages(baseFunc);
    }
}
