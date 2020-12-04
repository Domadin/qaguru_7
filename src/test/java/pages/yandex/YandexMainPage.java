package pages.yandex;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {

    public YandexMainPage open() {
        Selenide.open("/");
        return this;
    }

    public static void searchFor(String query) {
        $("#text").val(query).pressEnter();
    }
}
