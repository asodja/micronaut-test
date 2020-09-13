package io.micronaut.test.junit5;

import static org.mockito.Mockito.mock;

import javax.inject.Inject;

import io.micronaut.test.annotation.MockBean;

public class SimpleBaseV2Test {

    @Inject
    protected SimpleServiceInterface simpleService;

    @MockBean(SimpleService.class)
    SimpleServiceInterface simpleService() {
        return mock(SimpleService.class);
    }

}
