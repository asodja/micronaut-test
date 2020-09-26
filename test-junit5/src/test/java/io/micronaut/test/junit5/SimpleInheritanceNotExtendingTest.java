package io.micronaut.test.junit5;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class SimpleInheritanceNotExtendingTest {

    @Inject
    SimpleServiceInterface simpleService;

    @Test
    void simpleTest() {
        Assertions.assertNotNull(simpleService);
        Assertions.assertEquals("io.micronaut.test.junit5.SimpleService", simpleService.toString().split("@")[0]);
    }

}
