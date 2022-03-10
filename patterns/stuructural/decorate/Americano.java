package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class Americano implements  Coffee{

    public Americano() {
    }

    @Override
    public String name() {
        return "Americano";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(6);
    }
}
