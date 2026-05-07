package ejercicio7;

public class Leon extends Felino {

    private int numManada;
    private double potenciaRugido;

    public Leon(String habitat,
                double altura,
                double largo,
                double peso,
                String nombreCientifico,
                double tamanoGarras,
                int velocidad,
                int numManada,
                double potenciaRugido) {

        super(habitat, altura, largo, peso,
              nombreCientifico,
              tamanoGarras,
              velocidad);

        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El leon caza en manada";
    }

    @Override
    public String dormir() {
        return "El leon duerme en la sabana";
    }

    @Override
    public String correr() {
        return "El leon corre rapido";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge fuerte";
    }
}