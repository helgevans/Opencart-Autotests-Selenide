package webdriver;

import com.codeborne.selenide.Selenide;

public class BaseForm {

    public void submitAlert() {
        Selenide.confirm();
    }
}
