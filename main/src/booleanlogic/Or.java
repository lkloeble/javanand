package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class Or {

    private Nand nand = new Nand();

    public GateValue out(GateValue a, GateValue b) {
        return nand.out(nand.out(a,a),nand.out(b,b));
    }
}
