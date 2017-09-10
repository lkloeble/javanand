import mypackage.Or;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;

/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class OrTest {

    private Or orGate = new Or();

    @Test
    public void or_gate_returns_appropriate_results() {
        assertEquals(ZERO, orGate.out(ZERO,ZERO));
        assertEquals(ONE, orGate.out(ONE,ZERO));
        assertEquals(ONE, orGate.out(ZERO,ONE));
        assertEquals(ONE, orGate.out(ONE,ONE));
    }
}
