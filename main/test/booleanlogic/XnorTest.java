package booleanlogic;

import mypackage.Xnor;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.ONE;
import static mypackage.GateValue.ZERO;
/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class XnorTest {

    private Xnor xnorGate = new Xnor();

    @Test
    public void xnor_gate_returns_appropriate_values() {
        assertEquals(ONE,xnorGate.out(ZERO,ZERO));
        assertEquals(ZERO,xnorGate.out(ZERO,ONE));
        assertEquals(ZERO,xnorGate.out(ONE,ZERO));
        assertEquals(ONE,xnorGate.out(ONE,ONE));
    }
}
