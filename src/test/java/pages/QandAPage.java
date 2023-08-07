package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class QandAPage extends TestBase {

    SelenideElement titleQAPage = $("h1 span").$(byText("Question and answers"));;

}
