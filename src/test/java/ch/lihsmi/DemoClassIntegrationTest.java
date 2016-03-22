package ch.lihsmi;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(ch.lihsmi.IntegrationTests.class)
public class DemoClassIntegrationTest {

    @Test
    public void assertSomething() {
        assertSame(1,1);
    }

}
