package booleanlogic;

import mypackage.Mux;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class MuxTest {

    private Mux muxGate = new Mux();

    @Test
    public void mux_gate_returns_appropriate_values() {
        assertEquals(ZERO,muxGate.out(ZERO,ZERO,ZERO));
        assertEquals(ZERO,muxGate.out(ZERO,ONE,ZERO));
        assertEquals(ONE,muxGate.out(ONE,ZERO,ZERO));
        assertEquals(ONE,muxGate.out(ONE,ONE,ZERO));
        assertEquals(ZERO,muxGate.out(ZERO,ZERO,ONE));
        assertEquals(ONE,muxGate.out(ZERO,ONE,ONE));
        assertEquals(ZERO,muxGate.out(ONE,ZERO,ONE));
        assertEquals(ONE,muxGate.out(ONE,ONE,ONE));
    }
}
