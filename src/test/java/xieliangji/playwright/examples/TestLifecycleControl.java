package xieliangji.playwright.examples;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class TestLifecycleControl {

    private static final long DEBUG_SLOW_MILLIS = 3000L;

    static Playwright playwright;
    static Browser browser;

    protected BrowserContext context;
    protected Page page;

    @BeforeAll
    @DisplayName("初始化浏览器")
    static void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(
                        new BrowserType.LaunchOptions()
                                .setSlowMo(DEBUG_SLOW_MILLIS)
                                .setHeadless(true)
                );
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

}
