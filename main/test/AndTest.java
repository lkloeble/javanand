import mypackage.And;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static mypackage.GateValue.*;
/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class AndTest {

    private And andGate = new And();

    @Test
    public void and_gate_should_return_appropriate_results() {
        assertEquals(ZERO,andGate.out(ZERO,ZERO));
        assertEquals(ZERO,andGate.out(ONE,ZERO));
        assertEquals(ZERO,andGate.out(ZERO,ONE));
        assertEquals(ONE,andGate.out(ONE,ONE));
    }
}
