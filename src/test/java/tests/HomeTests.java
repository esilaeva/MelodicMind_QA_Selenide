package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomeTests extends TestBase {

    HomePage home = new HomePage();

    @Test
    public void verificationButtons() {
        home
                .openHomePage()
                .verifficationTheStoryButton()
                .checkTheStoryPageOpened()
                .verifficationLearnButton()
                .checkLearnPageOpened()
                .verifficationBlogButton()
                .checkBlogPageOpened()
                .verifficationContactButton()
                .checkContactPageOpened()
                .verifficationQandAButton()
                .checkQandAPageOpened()
                .verifficationLoginOrProfileButton()
                .checkLoginOrProfilePageOpened()
                .verifficationSettingsButton()
                .checkSettingsModalWindowOpened();
    }


}
