package xieliangji.playwright.examples;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

@DisplayName("快速开始")
public class QuickstartTest {

    @Test
    void quickstartTest() {
        Assertions.assertTrue(true);
    }

    @Nested
    class PlaywrightTest {

        static final String GOOGLE_URL = "https://google.com/ncr";

        static Playwright playwright;
        static Browser browser;

        BrowserContext context;
        Page page;

        @BeforeAll
        @DisplayName("初始化浏览器")
        static void setup() {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setSlowMo(50).setHeadless(false));
        }

        @AfterAll
        @DisplayName("关闭浏览器")
        static void teardown() {
            browser.close();
            playwright.close();
        }

        @BeforeEach
        @DisplayName("初始化页面")
        void initContextPage() {
            context = browser.newContext();
            page = context.newPage();
        }

        @AfterEach
        @DisplayName("关闭页面")
        void releaseContextPage() {
            page.close();
            context.close();
        }

        @Test
        @DisplayName("打开Google Search页面")
        void testPageTitle() {
            page.navigate(GOOGLE_URL);
            Assertions.assertEquals("Google", page.title());
        }
    }
}
