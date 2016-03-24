package ch.lihsmi.unit;

import ch.lihsmi.DemoClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(ch.lihsmi.UnitTests.class)
public class DemoClassTest {

    private DemoClass demoClass;

    @Before
    public void setup() {
        demoClass = new DemoClass();
    }

    @Test
    public void demoMethodReturnsExpectedValue() {
        assertSame(demoClass.demoMethod(), "Hallo");
    }

}