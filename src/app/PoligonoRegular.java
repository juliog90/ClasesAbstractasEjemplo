package app;

import app.Figuras.*;

public enum PoligonoRegular {
    // El punto y coma es obligatorio para los enums que tienen parametros
    TRIANGULO(3), SQUARE(4), PENTAGON(5), HEXAGON(6);

    private Figura figura;

    public Figura getShape() {
        return figura;
    }

    private PoligonoRegular(int lados)
    {
        switch (lados)
        {
            case 3:
            // Nosotros asumimos que esos son constructores generales
            // para figuras que tengan el tamano de los lados y
            // angulos en grados como parametros
            figura = new Triangulo(1, 1, 1, 60, 60, 60);
            break;
            case 4:
            figura = new Rectangulo(1, 1);
            break;
            case 5:
            figura = new Pentagono(1, 1, 1, 1, 1, 108, 108, 108, 108, 108);
            break;
            case 6:
            figura = new Hexagono(1, 1, 1, 1, 1, 1, 120, 120, 120, 120, 120, 120);
            break;
        }
    }
}