package booleanlogic;

import mypackage.Nor;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class NorTest {

    private Nor norGate = new Nor();

    @Test
    public void nor_gate_return_appropriate_results_for_gate_values() {
        assertEquals(ONE, norGate.out(ZERO,ZERO));
        assertEquals(ZERO, norGate.out(ONE,ZERO));
        assertEquals(ZERO, norGate.out(ZERO,ONE));
        assertEquals(ZERO, norGate.out(ONE,ONE));
    }
}
