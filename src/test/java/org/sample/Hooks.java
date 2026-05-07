package org.sample;
import io.cucumber.java.AfterAll;

public class Hooks {

    @AfterAll
    public static void tearDown() {
        Snippet.generateReport();
    }
}