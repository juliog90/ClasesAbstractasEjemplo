package app;

/**
 * Animal
 */
public abstract class Animal {

    private String picture;
    private String food;
    private Integer hunger;
    private String boundaries;
    private String location;

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String valor) {
        this.picture = valor;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String valor) {
        this.food = valor;
    }

    public Integer getHunger() {
        return this.hunger;
    }

    public void setHunger(Integer valor) {
        this.hunger = valor;
    } 

    public String getBoundaries() {
        return this.boundaries;
    }

    public void setBoundaries(String valor) {
        this.boundaries = valor;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String valor) {
        this.location = valor;
    }

    public abstract String makeNoise();

    public void eat() {
        System.out.println("Eating food");
    }

    public void sleep() {
        System.out.println("Z z z z");
    }

    public void roam() {
        System.out.println("Roaming Normally");
    }
}