import java.util.ArrayList;
import java.util.List;

public class Heroe implements Prototype{
    private String nombre;
    private String clase;
    private List<Habilidad> habilidades;
    private int nivel;
    private int puntosExperiencia;

    public Heroe(String nombre, String clase, List<Habilidad> habilidades, int nivel, int puntosExperiencia) {
        this.nombre = nombre;
        this.clase = clase;
        this.habilidades = new ArrayList<>(habilidades);
        this.nivel = nivel;
        this.puntosExperiencia = puntosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    @Override
    public Heroe clone() {
        return new Heroe(nombre, clase, habilidades, nivel, puntosExperiencia);
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", habilidades=" + habilidades +
                ", nivel=" + nivel +
                ", puntosExperiencia=" + puntosExperiencia +
                '}';
    }
}
