package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.google.GoogleMainPage;

public class GoogleTest {

    GoogleMainPage googlePage = new GoogleMainPage();

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "http://google.com/";
    }

    @Test
    public void userCanSearch() {
        googlePage.open()
                .searchFor("selenide")

                .assertResultsCount(7)
                .assertResultPresence(0, "Selenide: лаконичные и стабильные UI тесты на Java");
    }
}
