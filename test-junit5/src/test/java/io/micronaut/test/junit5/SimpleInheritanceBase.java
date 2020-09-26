package io.micronaut.test.junit5;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.context.annotation.Requires;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest(environments = { "test", "enable-simple-inheritence-mocks" })
public abstract class SimpleInheritanceBase {

    @Inject
    SimpleServiceInterface simpleService;

    @Test
    void simpleBaseTest() {
        Assertions.assertNotNull(simpleService);
        Assertions.assertEquals("Mock for SimpleServiceInterface", simpleService.toString().split(",")[0]);
    }

    @Factory
    @Requires(env = "enable-simple-inheritence-mocks")
    public static class SimpleInheritenceMockFactory {

        @Bean
        @Replaces(SimpleService.class)
        public SimpleServiceInterface mockServiceInterface() {
            return Mockito.mock(SimpleServiceInterface.class);
        }

    }

}
