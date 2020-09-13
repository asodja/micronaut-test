package io.micronaut.test.junit5;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

@MicronautTest
public class Simple1Test extends SimpleBaseTest {

    @Inject
    SimpleService simpleService;

    @Test
    void testComputeNumToSquare() {
        assertNotNull(simpleService);
        assertEquals(mock(SimpleService.class).getClass(), simpleService.getClass());
    }
}
