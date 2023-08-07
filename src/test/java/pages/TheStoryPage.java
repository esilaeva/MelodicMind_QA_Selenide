package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TheStoryPage extends TestBase {
    SelenideElement titleTheStoryPage = $("h1 span").$(byText("The Story"));


}
