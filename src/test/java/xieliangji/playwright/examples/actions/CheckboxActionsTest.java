package xieliangji.playwright.examples.actions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xieliangji.playwright.examples.TestLifecycleControl;

@DisplayName("复选框Action测试")
public class CheckboxActionsTest extends TestLifecycleControl {

    private static final String content = "<input type='checkbox'>";

    Locator checkbox;

    @BeforeEach
    void createCheckboxAndFindElement() {
        page.setContent(content);
        checkbox = page.getByRole(AriaRole.CHECKBOX);
    }

    @Test
    @DisplayName("测试获取复选框的选中状态")
    void testIsChecked() {
        Assertions.assertFalse(checkbox.isChecked());
    }


    @Test
    @DisplayName("测试选中复选框")
    void testCheck() {
        checkbox.check();
        Assertions.assertTrue(checkbox.isChecked());
    }
}
