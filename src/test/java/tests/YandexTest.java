package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.yandex.YandexMainPage;
import pages.yandex.YandexResultsPage;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {

    YandexMainPage yandex = new YandexMainPage();
    YandexResultsPage results = new YandexResultsPage();

    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "https://yandex.ru";
    }

    @Test
    public void searchSelenideInYandex() {
        open("");

        yandex.searchFor("Selenide");

        results.shouldHaveSize(11);
        results.shouldHaveResult(0, "Selenide: лаконичные и стабильные UI тесты на Java");
    }
}
