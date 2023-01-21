package pageobject;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.FinalPage;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatsPage;

public class TicketsTestsOnPages {
    private final String url = "qaguru.lv:8089/tickets/";
    private final String fromAirport = "RIX";
    private final String toAirport = "SFO";
    private final String finalText = "Thank You for flying with us!";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("Diana", "Klavdeva", "12345", 2,
                1,4, "16-05-2018");
        int seatNr = RandomUtils.nextInt(1, 35);

        baseFunc.openUrl(url);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(fromAirport, toAirport);


        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(fromAirport, infoPage.getFirstFromAirport(), "Incorrect first airport from");
        Assertions.assertEquals(fromAirport, infoPage.getSecondFromAirport(), "Incorrect second airport from");
        Assertions.assertEquals(toAirport, infoPage.getFirstToAirport(),"Incorrect first airport to");
        Assertions.assertEquals(toAirport, infoPage.getSecondToAirport(),"Incorrect second airport to");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error message");

        infoPage.book();

       SeatsPage seatsPage = new SeatsPage(baseFunc);
       seatsPage.clickSeatNumber(seatNr);

       int clickSeatNumber =  seatsPage.getSelectedSeatNr();
       Assertions.assertEquals(seatNr, clickSeatNumber, "Wrong seat selected");

       seatsPage.bookEnd();

       FinalPage finalPage = new FinalPage(baseFunc);
       Assertions.assertTrue(finalPage.isSuccessfulRegistrationTextAppears(), "Wrong text on final page");
    }
}
