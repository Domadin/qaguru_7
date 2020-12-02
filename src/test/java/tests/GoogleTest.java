package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.google.GoogleMainPage;
import pages.google.GoogleResultsPage;

public class GoogleTest {

    GoogleMainPage google = new GoogleMainPage();
    GoogleResultsPage results = new GoogleResultsPage();

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "http://google.com/";
    }

    @Test
    public void userCanSearch() {
        google.open().searchFor("selenide");
        results.shouldHaveSize(7)
                .shouldHaveResult(0, "Selenide: лаконичные и стабильные UI тесты на Java");
    }
}
