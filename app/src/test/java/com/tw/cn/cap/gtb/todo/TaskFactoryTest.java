package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TaskFactoryTest {

    @Test
    void should_support_name_with_multiple_white_space() {
        final var task = TaskFactory.createTask(1, "+    foo  bar  ");
        assertEquals("   foo  bar  ", task.getName());
    }

    @Test
    void should_parse_completed_property_for_task() {
        final var isCompleted = TaskFactory.createTask(1,"+ task").isCompleted();
        assertFalse(isCompleted);
        
        
    }

}