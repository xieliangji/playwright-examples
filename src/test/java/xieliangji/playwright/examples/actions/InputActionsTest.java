package xieliangji.playwright.examples.actions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xieliangji.playwright.examples.TestLifecycleControl;

@DisplayName("输入框相关的Action")
public class InputActionsTest extends TestLifecycleControl {

    static final String content = "<input value='hello'>";

    @BeforeEach
    void initialPage() {
        page.setContent(content);
    }

    @Test
    @DisplayName("获取输入框的内容")
    void testInputContentFetching() {
        String boxValue = page.getByRole(AriaRole.TEXTBOX).inputValue();
        Assertions.assertEquals("hello", boxValue);
    }

    @Test
    @DisplayName("填充输入框")
    void testFillInput() {
        Locator box = page.getByRole(AriaRole.TEXTBOX);
        box.fill("world");
        Assertions.assertEquals("world", box.inputValue());
    }
}
