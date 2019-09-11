package app;

/**
 * Wolf
 */
public class Wolf extends Canine{

    @Override
    public String makeNoise() {
        return "Auuuuuuu";
    }

    @Override
    public void eat() {
        System.out.println("Eating Fresh Meat");
    }
}