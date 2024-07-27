import java.util.List;

public class Guerrero extends Heroe {
    public Guerrero(String nombre, List<Habilidad> habilidades, int nivel, int puntosExperiencia) {
        super(nombre, "Guerrero", habilidades, nivel, puntosExperiencia);
    }
}