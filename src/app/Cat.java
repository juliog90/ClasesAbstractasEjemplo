package app;

/**
 * Cat
 */
public class Cat extends Feline{

    @Override
    public String makeNoise() {
        return "Miau Miau";
    }

    @Override
    public void eat() {
        System.out.println("Eating Wiskas");
    }
    
}