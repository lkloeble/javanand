package mypackage;

/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class Not {

    private Nand nand = new Nand();

    public GateValue out(GateValue value) {
        return nand.out(value, value);
    }
}
