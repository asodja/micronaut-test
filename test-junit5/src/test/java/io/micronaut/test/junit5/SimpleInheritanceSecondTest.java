package io.micronaut.test.junit5;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleInheritanceSecondTest extends SimpleInheritanceBase {

    @Inject
    SimpleServiceInterface simpleService;

    @Test
    void simpleTest() {
        Assertions.assertNotNull(simpleService);
        Assertions.assertEquals("Mock for SimpleServiceInterface", simpleService.toString().split(",")[0]);
    }

}
