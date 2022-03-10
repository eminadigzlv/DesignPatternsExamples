package patterns.stuructural.decorate;

import java.math.BigDecimal;

public abstract class CoffeDecorator implements Coffee{
    Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }



    @Override
    public String name() {
        return coffee.name();
    }

    @Override
    public BigDecimal cost() {
        return coffee.cost();
    }
}
