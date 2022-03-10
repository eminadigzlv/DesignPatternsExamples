package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class SimpleCoffe implements Coffee{
    public SimpleCoffe() {
    }

    @Override
    public String name() {
        return "Simple Coffe";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(3);
    }
}
