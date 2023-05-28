package xieliangji.playwright.examples.testpages.actions;

import com.microsoft.playwright.Page;
import xieliangji.playwright.examples.testpages.page.HomePage;

public class HomePageAction extends HomePage {

    public HomePageAction(Page page) {
        super(page);
    }

    public void navigate() {
        page.navigate("https://testpages.herokuapp.com/styled/index.html");
    }

    public String getHeaderText() {
        return pageHeader().textContent();
    }

    public String getHeaderQuoteContent() {
        return pageHeaderQuote().textContent();
    }

    public String getExamplesTitleText() {
        return examplesTitle().textContent();
    }

    public String getExamplesTitleQuoteContent() {
        return examplesTitleQuote().textContent();
    }

    public void clickBasicExampleLink() {
        basicExampleLink().click();
    }
}
