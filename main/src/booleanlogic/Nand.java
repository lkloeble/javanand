package booleanlogic;

import static booleanlogic.GateValue.*;

/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class Nand  {

    public GateValue out(GateValue a, GateValue b) {
        if(a.equals(ONE) && b.equals(ONE)) {
            return ZERO;
        }
        return ONE;
    }
}
