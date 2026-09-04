package com.molo.testjenkins.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void shouldReturnHelloJenkins() {

        HelloController controller = new HelloController();

        assertEquals(
                "Hello Jenkins!",
                controller.hello()
        );
    }
}