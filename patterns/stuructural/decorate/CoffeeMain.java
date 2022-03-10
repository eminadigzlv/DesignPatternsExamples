package patterns.stuructural.decorate;

public class CoffeeMain {
    public static void main(String[] args) {

     Coffee coffee= new  Milk(new Vanilla(new Americano()));
     print(coffee);

     Coffee coffee1= new Vanilla(new Latte());
     print(coffee1);

     Coffee coffee2= new Chocalate(new Espresso());
     print(coffee2);
    }
    public static void  print(Coffee coffee){
        System.out.println(" Coffe = " + coffee.name()+ " cost = " + coffee.cost());
    }
}
