package patterns.stuructural.decorate;

import java.math.BigDecimal;

public class Vanilla extends CoffeDecorator{

    public Vanilla(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String name() {
        return super.name();
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(BigDecimal.valueOf(3));
    }
}
