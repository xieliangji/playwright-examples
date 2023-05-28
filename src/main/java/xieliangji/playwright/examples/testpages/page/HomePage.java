package xieliangji.playwright.examples.testpages.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    protected final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public Locator pageHeader() {
        return page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Test Pages For Automating"));
    }

    public Locator pageHeaderQuote() {
        return page.getByText("This is a set of pages for automating or testing. Some of the examples are suita");
    }

    public Locator examplesTitle() {
        return page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Examples"));
    }

    public Locator examplesTitleQuote() {
        return page.getByText("This set of pages are styled and have explanation/help on the page. They can sup");
    }

    public Locator basicExampleLink() {
        return page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Basic Web Page Example"));
    }
}
