package io.micronaut.test.junit5;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.test.annotation.MockBean;

public class SimpleInheritanceFirstTest extends SimpleInheritanceBase {

    @Inject
    SimpleServiceInterface simpleService;

    @Test
    void simpleTest() {
        Assertions.assertNotNull(simpleService);
        Assertions.assertEquals("Mock for SimpleServiceInterface", simpleService.toString().split(",")[0]);
    }

}
