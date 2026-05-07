package ejercicio7;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat,
                double altura,
                double largo,
                double peso,
                String nombreCientifico,
                String color,
                double tamanoColmillos,
                int numCamada,
                String especieLobo) {

        super(habitat, altura, largo, peso,
              nombreCientifico,
              color,
              tamanoColmillos);

        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo caza en grupo";
    }

    @Override
    public String dormir() {
        return "El lobo duerme en cuevas";
    }

    @Override
    public String correr() {
        return "El lobo corre largas distancias";
    }

    @Override
    public String comunicarse() {
        return "El lobo aulla";
    }
}