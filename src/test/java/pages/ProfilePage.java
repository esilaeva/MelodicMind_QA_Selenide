package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends TestBase {

    SelenideElement
            continueWithGoogle = $("div.btn-container"),
            btnDeleteAccount = $("href='/delete-user'");
}
