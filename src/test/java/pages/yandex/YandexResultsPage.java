package pages.yandex;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class YandexResultsPage {

    private final ElementsCollection results = $(".serp-list").$$(".serp-item");

    public void shouldHaveSize(int qty) {
        results.shouldHaveSize(qty);
    }

    public void shouldHaveResult(int index, String expectedText) {
        results.get(index).shouldHave(text(expectedText));
    }
}
