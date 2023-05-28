package xieliangji.playwright.examples.testpages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xieliangji.playwright.examples.TestLifecycleControl;
import xieliangji.playwright.examples.testpages.actions.HomePageAction;

public class HomePageTest extends TestLifecycleControl {

    HomePageAction action;

    @BeforeEach
    void prepare() {
        action = new HomePageAction(page);
        action.navigate();
    }

    @Test
    @DisplayName("验证页面大标题正确")
    void verifyHeaderText() {
        String expected = "Test Pages For Automating";
        Assertions.assertEquals(expected, action.getHeaderText());
    }

    @Test
    @DisplayName("验证页面大标题说明内容正确")
    void verifyHeaderQuoteContent() {
        String expected = """
                This is a set of pages for automating or testing.
                            Some of the examples are suitable for manual exploratory testing or JavaScript hacking.
                       \s""";
        Assertions.assertEquals(expected, action.getHeaderQuoteContent());
    }

    @Test
    @DisplayName("验证Examples标题正确")
    void verifyExamplesTitleText() {
        String expected = "Examples";
        Assertions.assertEquals(expected, action.getExamplesTitleText());
    }

    @Test
    @DisplayName("验证Examples标题说明内容正确")
    void verifyExamplesTitleQuoteContent() {
        String expected = """
                This set of pages are styled and
                            have explanation/help on the page. They can support exploratory testing, learning HTML,
                            learning Technical Web Testing, and JavaScript hacking.
                       \s""";
        Assertions.assertEquals(expected, action.getExamplesTitleQuoteContent());
    }

}
