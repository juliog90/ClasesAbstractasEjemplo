package app;

/**
 * Dog
 */
public class Dog extends Canine{

    @Override
    public String makeNoise() {
        return "Guau Guau";
    }

    @Override
    public void eat() {
        System.out.println("Eating Food Leftovers");
    }
}