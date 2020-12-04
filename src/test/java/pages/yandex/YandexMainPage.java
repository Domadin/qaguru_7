package pages.yandex;

import static com.codeborne.selenide.Selenide.$;

public class YandexMainPage {

    public static void searchFor(String query) {
        $(".input__control").val(query).pressEnter();
    }
}
