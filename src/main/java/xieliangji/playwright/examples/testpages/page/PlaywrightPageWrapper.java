package xieliangji.playwright.examples.testpages.page;

import com.microsoft.playwright.Page;

public abstract class PlaywrightPageWrapper {

    protected final Page page;

    public PlaywrightPageWrapper(Page page) {
        this.page = page;
    }
}
