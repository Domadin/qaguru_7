package pages.google;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GoogleResultsPage {
    private final ElementsCollection results = $("#search").$$(".g");

    public GoogleResultsPage shouldHaveSize(int size) {
        results.shouldHaveSize(size);
        return this;
    }

    public GoogleResultsPage shouldHaveResult(int index, String text) {
        results.get(index).shouldHave(text(text));
        return this;
    }
}
