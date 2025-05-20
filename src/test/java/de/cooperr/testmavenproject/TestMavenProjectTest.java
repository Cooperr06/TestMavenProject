package de.cooperr.testmavenproject;

import org.junit.jupiter.api.Test;

class TestMavenProjectTest {

    @Test
    void testMessage() {
        assert(TestMavenProject.getMessage().equals("Hello World!"));
    }
}
