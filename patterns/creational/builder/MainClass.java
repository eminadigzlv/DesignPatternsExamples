package patterns.creational.builder;

public class MainClass {
    public static void main(String[] args) {
      Pizza pizza = new PizzaBuilder("Marqarita",PizzaSize.MEDIUM,true,true,true)
              .meat(PizzaMeat.CHICKEN)
              .sausage(true)
              .olives(true)
              .crow(true)
              .pepper(true)
              .build();
        System.out.println(pizza);
    }
}
