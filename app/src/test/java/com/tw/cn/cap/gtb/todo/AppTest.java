package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {
    @Test
    void should_list_existing_tasks() {
        final var result = new App().run();
        Assertions.assertEquals(List.of(
                "# To be done",
                "1 task01",
                "2 task02",
                "# Completed",
                "3 task03",
                "4 task04"        ),
                result);
    }

    @Test
    void should_add_task_with_single_word_as_name() {
        new App().run("add","foobar");
        final var result = new App().run();
        Assertions.assertEquals(List.of(
                "# To be done",
                "1 task01",
                "2 task02",
                "5 foobar",
                "# Completed",
                "3 task03",
                "4 task04"        ),
                result);
    }

}
