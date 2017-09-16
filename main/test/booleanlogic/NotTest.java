package booleanlogic;

import mypackage.Not;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class NotTest {

    private Not notGate = new Not();

    @Test
    public void not_gate_should_return_correct_out_values() {
        assertEquals(ZERO, notGate.out(ONE));
        assertEquals(ONE, notGate.out(ZERO));
    }
}
