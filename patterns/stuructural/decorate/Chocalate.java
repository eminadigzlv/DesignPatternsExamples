package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class Chocalate extends CoffeDecorator{
    public Chocalate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String name() {
        return super.name() + " with chocalate";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(BigDecimal.valueOf(3));
    }
}
