package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class Latte implements Coffee{
    public Latte() {
    }



    @Override
    public String name() {
        return "Latte";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(5);
    }
}
