package InterfaceDemo;

public class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "Chicken:cock a double doo";
    }

    @Override
    public String howToEat() {
        return "Chicken:fry it!";
    }
}

