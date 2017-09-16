package booleanlogic;

import mypackage.Xor;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class XorTest {

    private Xor orGate = new Xor();

    @Test
    public void or_should_return_appropriate_results() {
        assertEquals(ZERO, orGate.out(ZERO,ZERO));
        assertEquals(ONE, orGate.out(ZERO,ONE));
        assertEquals(ONE, orGate.out(ONE,ZERO));
        assertEquals(ZERO, orGate.out(ONE,ONE));
    }
}
