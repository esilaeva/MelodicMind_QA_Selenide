package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends TestBase {

    SelenideElement
            home = $("a[href='/'"),
            theStory = $("a[href='/the-story']"),
            learn = $("a[href='/learn']"),
            blog = $("a[href='/blog']"),
            contact = $("a[href='/contact']"),
            qa = $("a[href='/qa']"),
            login = $("a[href='/login']"),
            settings = $("header div div div div button"),
            useOurAppsForFree = $("h1 h1 button");


}
