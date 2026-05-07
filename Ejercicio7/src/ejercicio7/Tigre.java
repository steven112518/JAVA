package ejercicio7;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat,
                 double altura,
                 double largo,
                 double peso,
                 String nombreCientifico,
                 double tamanoGarras,
                 int velocidad,
                 String especieTigre) {

        super(habitat, altura, largo, peso,
              nombreCientifico,
              tamanoGarras,
              velocidad);

        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre caza solo";
    }

    @Override
    public String dormir() {
        return "El tigre duerme en la selva";
    }

    @Override
    public String correr() {
        return "El tigre corre silenciosamente";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge";
    }
}