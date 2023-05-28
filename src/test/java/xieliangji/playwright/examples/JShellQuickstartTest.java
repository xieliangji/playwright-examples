package xieliangji.playwright.examples;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("测试JShell执行脚本")
public class JShellQuickstartTest {


    @Test
    @DisplayName("测试JShell执行代码")
    void execCodes() {
        try (JShell jShell = JShell.create()) {
            jShell.eval("import java.util.*;");
            jShell.eval("List<String> list = List.of(\"hello\", \"jshell\");");
            List<SnippetEvent> events = jShell.eval("System.out.println(list);");
            events.forEach(event -> System.out.println(event.value()));
        }

    }
}
