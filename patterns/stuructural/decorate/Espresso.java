package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class Espresso implements Coffee{

    public Espresso() {
    }
    @Override
    public String name() {
        return "Espresso";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(7);
    }
}
