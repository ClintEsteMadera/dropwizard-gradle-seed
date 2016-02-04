package com.example.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void shouldPass() {
        assertThat(true, is(true));
    }

    @Test
    public void shouldFail() {
        assertThat(true, is(false));
    }
}
