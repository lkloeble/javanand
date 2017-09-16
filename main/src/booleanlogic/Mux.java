package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 10/09/2017.
 */
public class Mux {

    private And andGate = new And();
    private Not notGate = new Not();

    public GateValue out(GateValue a, GateValue b, GateValue selector) {
        GateValue sAndS = andGate.out(selector,selector);
        GateValue bAndS = andGate.out(b,selector);
        GateValue notSAndS = notGate.out(sAndS);
        GateValue notBAndS = notGate.out(bAndS);
        GateValue aAndNotSAndS = andGate.out(a, notSAndS);
        GateValue temp1 = notGate.out(aAndNotSAndS);
        return notGate.out(andGate.out(temp1,notBAndS));
    }
}
