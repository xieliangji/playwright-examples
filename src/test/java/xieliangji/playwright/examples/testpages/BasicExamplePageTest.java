package xieliangji.playwright.examples.testpages;

import org.junit.jupiter.api.*;
import xieliangji.playwright.examples.TestLifecycleControl;
import xieliangji.playwright.examples.testpages.actions.BasicExampleAction;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicExamplePageTest extends TestLifecycleControl {

    BasicExampleAction action;

    @BeforeEach
    void prepare() {
        action = new BasicExampleAction(page);
        action.navigate();
    }

    @Test
    @DisplayName("验证首页跳转链接正确")
    @Order(1)
    void verifyHomeLink() {
        action.jumpHomeThenReturn();
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("验证页面标题正确")
    @Order(2)
    void verifyPageTitle() {
        String expected = "Basic Web Page Example";
        Assertions.assertEquals(expected, action.getHeaderText());
    }

    @Test
    @DisplayName("验证页面标题说明正确")
    @Order(3)
    void verifyPageTitleQuote() {
        String expected = """

                        Very simple web pages have a structure illustrated by this page. And elements can have id and class attributes for styling and locating
                       \s
                    \
                """;
        Assertions.assertEquals(expected, action.getHeaderQuoteContent());
    }

    @Test
    @DisplayName("验证第一个段落文本正确")
    @Order(4)
    void verifyFirstParagraphContent() {
        String expected = "A paragraph of text";
        Assertions.assertEquals(expected, action.getFirstParagraphContent());
    }

    @Test
    @DisplayName("验证第二个段落文本正确")
    @Order(5)
    void verifySecondParagraphContent() {
        String expected = "Another paragraph of text";
        Assertions.assertEquals(expected, action.getSecondParagraphContent());
    }

    @Test
    @DisplayName("验证底部链接跳转正确")
    @Order(6)
    void verifyBottomLinkJump() {
        action.jumpFromBottomThenReturn();
        Assertions.assertTrue(true);
    }
}
