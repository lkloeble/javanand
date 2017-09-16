package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class And  {

    private Nand nand = new Nand();


    public GateValue out(GateValue a, GateValue b) {
        GateValue tempOut = nand.out(a, b);
        return nand.out(tempOut,tempOut);
    }
}
