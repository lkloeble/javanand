package booleanlogic;

/**
 * Created by Laurent KLOEBLE on 09/09/2017.
 */
public enum GateValue {

    ZERO(0), ONE(1);

    private Integer value;

    GateValue(Integer value) {
        this.value = value;
    }

    public boolean equals(GateValue other) {
        return value == other.value;
    }
}
