package xieliangji.playwright.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("快速开始")
public class QuickstartTest {

    @Test
    void quickstartTest() {
        Assertions.assertTrue(true);
    }

    @Nested
    class PlaywrightTest extends TestLifecycleControl {
        static final String GOOGLE_URL = "https://google.com/ncr";


        @Test
        @DisplayName("打开Google Search页面")
        void testPageTitle() {
            page.navigate(GOOGLE_URL);
            Assertions.assertEquals("Google", page.title());
        }
    }
}
