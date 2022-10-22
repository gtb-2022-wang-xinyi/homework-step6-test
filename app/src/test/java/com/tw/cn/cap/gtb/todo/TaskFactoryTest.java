package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class TaskFactoryTest {

    @Test
    void should_parse_completed_property_for_task() {
        final var isCompleted = TaskFactory.createTask(1,"+ task").isCompleted();
        assertFalse(isCompleted);
    }
}