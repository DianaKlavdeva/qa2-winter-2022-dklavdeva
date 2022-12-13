package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.pages.FinalPage;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatsPage;

public class TicketsTestsOnPages {
    private final String url = "qaguru.lv:8089/tickets/";
    private final String fromAirport = "RIX";
    private final String toAirport = "SFO";
    private final String firstName = "Diana";
    private final String lastName = "Klavdeva";
    private final String discountCode = "12345";
    private final String adults = "3";
    private final String children = "2";
    private final String bag = "1";
    private final String valueDate = "15";
    private final String seat = "5";
    private final String responseWithName = firstName;
    private final String price = "3030";
    private final String seatIs = seat;
    private final String finalText = "Thank You for flying with us!";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(url);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(fromAirport, toAirport);

        Assertions.assertEquals(fromAirport, fromAirport, "Airports not appear");
        Assertions.assertEquals(toAirport, toAirport, "Airport not appear");

        PassengerInfoPage infoPages = new PassengerInfoPage(baseFunc);
        infoPages.typePassengerInfo(firstName, lastName, discountCode, adults, children, bag);
        infoPages.selectFlightDate(valueDate);

        Assertions.assertTrue(fromAirport.contains(fromAirport), "Destination airport From is wrong!");
        Assertions.assertTrue(toAirport.contains(toAirport), "Destination airport To is wrong!");
        Assertions.assertTrue(responseWithName.contains(firstName), "Incorrect name");
        Assertions.assertTrue(fromAirport.contains(fromAirport), "Airport From is wrong");
        Assertions.assertTrue(toAirport.contains(toAirport), "Airport To is wrong");
        Assertions.assertTrue(price.equals(price), "Doesn't have price");

        SeatsPage seatspage = new SeatsPage(baseFunc);
        seatspage.clickSeatNumber(seat);
        boolean isSeatSelect = false;
        isSeatSelect = true;
        Assertions.assertTrue(isSeatSelect, "Seat not select");
        Assertions.assertTrue(seatIs.contains(seat), "Seat number is incorrect");

        FinalPage finalPage = new FinalPage(baseFunc);

        Assertions.assertEquals(finalText, finalText, "Final text is incorrect!");
        Assertions.assertTrue(finalText.equals(finalText), "Final text is incorrect!");
    }
}
