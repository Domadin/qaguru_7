package pages.yandex;

import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {

    public static void searchFor(String query) {
        $("#text").val(query).pressEnter();
    }
}
