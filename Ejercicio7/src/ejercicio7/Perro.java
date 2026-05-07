package ejercicio7;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat,
                 double altura,
                 double largo,
                 double peso,
                 String nombreCientifico,
                 String color,
                 double tamanoColmillos,
                 int fuerzaMordida) {

        super(habitat, altura, largo, peso,
              nombreCientifico,
              color,
              tamanoColmillos);

        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro salvaje caza";
    }

    @Override
    public String dormir() {
        return "El perro duerme";
    }

    @Override
    public String correr() {
        return "El perro corre rapido";
    }

    @Override
    public String comunicarse() {
        return "El perro gruñe";
    }
}