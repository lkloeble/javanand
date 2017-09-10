package mypackage;

/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public class Xor {

    private Nand nand = new Nand();

    public GateValue out(GateValue a, GateValue b) {
        GateValue aNandB = nand.out(a,b);
        return nand.out(nand.out(a,aNandB),nand.out(b,aNandB));
    }
}
