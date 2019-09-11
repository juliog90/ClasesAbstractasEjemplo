package app;

/**
 * Animal
 */
public abstract class Animal {

    private String foto;
    private String comida;
    private Integer hambre;
    private String limites;
    private String habitat;

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String valor) {
        this.foto = valor;
    }

    public String getComida() {
        return this.comida;
    }

    public void setComida(String valor) {
        this.comida = valor;
    }

    public Integer getHambre() {
        return this.hambre;
    }

    public void setHambre(Integer valor) {
        this.hambre = valor;
    } 

    public String getLimites() {
        return this.limites;
    }

    public void setLimites(String valor) {
        this.limites = valor;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String valor) {
        this.habitat = valor;
    }

    public abstract String hacerRuido();

    public void comer() {
        System.out.println("Comiendo Alimento");
    }

    public void dormir() {
        System.out.println("Z z z z");
    }

    public void andar() {
        System.out.println("Andando normalmente");
    }
}