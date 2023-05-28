package xieliangji.playwright.examples.testpages.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class BasicExamplePage extends PlaywrightPageWrapper {


    public BasicExamplePage(Page page) {
        super(page);
    }

    // 返回首页的链接
    public Locator homePageLink() {
        return page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Index"));
    }

    public Locator pageHeader() {
        return page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Basic Web Page Example"));
    }

    public Locator pageHeaderQuote() {
        return page.locator("div").nth(2);
    }

    public Locator firstParagraph() {
        return page.getByText("A paragraph of text");
    }

    public Locator secondParagraph() {
        return page.getByText("Another paragraph of text");
    }

    public Locator bottomLink() {
        return page.getByText("EvilTester.com, Compendium Developments");
    }
}
