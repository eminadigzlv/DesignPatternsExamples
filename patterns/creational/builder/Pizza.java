package patterns.creational.builder;

public class Pizza {
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


    public Pizza() {
    }

    public Pizza(String name, PizzaSize size, boolean thin,
                 boolean sauce, boolean cheese, PizzaMeat meat,
                 boolean sausage, boolean olives, boolean crow,
                 boolean pepper) {
        this.name = name;
        this.size = size;
        this.thin = thin;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.sausage = sausage;
        this.olives = olives;
        this.crow = crow;
        this.pepper = pepper;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", thin=" + thin +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", sausage=" + sausage +
                ", olives=" + olives +
                ", crow=" + crow +
                ", pepper=" + pepper +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public boolean isThin() {
        return thin;
    }

    public void setThin(boolean thin) {
        this.thin = thin;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public PizzaMeat getMeat() {
        return meat;
    }

    public void setMeat(PizzaMeat meat) {
        this.meat = meat;
    }

    public boolean isSausage() {
        return sausage;
    }

    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public boolean isOlives() {
        return olives;
    }

    public void setOlives(boolean olives) {
        this.olives = olives;
    }

    public boolean isCrow() {
        return crow;
    }

    public void setCrow(boolean crow) {
        this.crow = crow;
    }

    public boolean isPepper() {
        return pepper;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }
}
