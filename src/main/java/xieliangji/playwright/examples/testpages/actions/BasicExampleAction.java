package xieliangji.playwright.examples.testpages.actions;

import com.microsoft.playwright.Page;
import xieliangji.playwright.examples.testpages.Helper;
import xieliangji.playwright.examples.testpages.page.BasicExamplePage;
import xieliangji.playwright.examples.testpages.page.HomePage;

public class BasicExampleAction extends BasicExamplePage {
    public BasicExampleAction(Page page) {
        super(page);
    }

    public void navigate() {
        page.navigate("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
    }

    public void jumpToHomePage() {
        homePageLink().click();
    }

    public void jumpHomeThenReturn() {
        jumpToHomePage();
        new HomePageAction(page).clickBasicExampleLink();
    }

    public String getHeaderText() {
        return pageHeader().textContent();
    }

    public String getHeaderQuoteContent() {
        return pageHeaderQuote().textContent();
    }

    public String getFirstParagraphContent() {
        return firstParagraph().textContent();
    }

    public String getSecondParagraphContent() {
        return secondParagraph().textContent();
    }

    public void jumpFromBottomThenReturn() {
        page.waitForPopup(() -> {
            bottomLink().click();
            Helper.pause(2);
        }).close();
    }
}
