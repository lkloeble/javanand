package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class Xnor {

    private Nand nand = new Nand();

    public GateValue out(GateValue a, GateValue b) {
        GateValue aNandB = nand.out(a,b);
        GateValue ATemp = nand.out(a,aNandB);
        GateValue BTemp = nand.out(b,aNandB);
        GateValue tempAB = nand.out(ATemp,BTemp);
        return nand.out(tempAB,tempAB);
    }
}
