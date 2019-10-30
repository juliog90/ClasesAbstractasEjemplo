package app;

public enum Nivel {
    ALTO  (3),  //llama al constructor con valor 3
    MEDIO (2),  //llama al constructor con valor 2
    BAJO  (1)   //llama al constructor con valor 1
    ; // Cuando se tengan metodos o campos se necesita el punto y coma


    private final int codigoNivel;

    Nivel(int codigoNivel) {
        this.codigoNivel = codigoNivel;
    }
    
    // Se pueden hacer calculos con los metodos
    public int getNivelCodigo() {
        return this.codigoNivel;
    }
    
}