package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class Nor {

    private Nand nand = new Nand();

    public GateValue out(GateValue a, GateValue b) {
        GateValue aNandA = nand.out(a,a);
        GateValue bNandB = nand.out(b,b);
        GateValue temp = nand.out(aNandA,bNandB);
        return nand.out(temp,temp);
    }
}
