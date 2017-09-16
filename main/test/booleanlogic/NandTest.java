package booleanlogic;

import mypackage.Nand;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class NandTest {

    private Nand gate = new Nand();

    @Test
    public void gate_should_return_appropriate_exit_result() {
        assertEquals(ZERO, gate.out(ONE, ONE));
        assertEquals(ONE, gate.out(ZERO, ZERO));
        assertEquals(ONE, gate.out(ONE, ZERO));
        assertEquals(ONE, gate.out(ZERO, ONE));
    }
}
