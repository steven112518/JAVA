package ejercicio7;

public class Guepardo extends Felino {

    public Guepardo(String habitat,
                    double altura,
                    double largo,
                    double peso,
                    String nombreCientifico,
                    double tamanoGarras,
                    int velocidad) {

        super(habitat, altura, largo, peso,
              nombreCientifico,
              tamanoGarras,
              velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo caza gacelas";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme bajo arboles";
    }

    @Override
    public String correr() {
        return "El guepardo es muy veloz";
    }

    @Override
    public String comunicarse() {
        return "El guepardo emite sonidos suaves";
    }
}