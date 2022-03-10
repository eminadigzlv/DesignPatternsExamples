package patterns.creational.builder;

public class PizzaBuilder {

    private  String    name;
    private PizzaSize  size;
    private boolean    thin;
    private boolean    sauce;
    private boolean    cheese;
    private PizzaMeat  meat;
    private boolean    sausage;
    private boolean    olives;
    private boolean    crow;
    private boolean    pepper;

    public PizzaBuilder(String name, PizzaSize size, boolean thin, boolean sauce, boolean cheese) {
        this.name = name;
        this.size = size;
        this.thin = thin;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    public PizzaBuilder meat( PizzaMeat meat){
        this.meat=meat;
        return this;
    }
    public PizzaBuilder sausage( boolean sausage){
        this.sausage=sausage;
        return this;
    }
    public PizzaBuilder olives( boolean olives){
        this.olives=olives;
        return this;
    }
    public PizzaBuilder crow( boolean crow){
        this.crow=crow;
        return this;
    }
    public PizzaBuilder pepper( boolean pepper){
        this.pepper=pepper;
        return this;
    }
    public  Pizza build()
    {
        Pizza pizza= new Pizza();
        pizza.setName(name);
        pizza.setSize(size);
        pizza.setThin(thin);
        pizza.setSauce(sauce);
        pizza.setCheese(cheese);
        pizza.setMeat(meat);
        pizza.setSausage(sausage);
        pizza.setOlives(olives);
        pizza.setCrow(crow);
        pizza.setPepper(pepper);
        return  pizza;
    }

}
