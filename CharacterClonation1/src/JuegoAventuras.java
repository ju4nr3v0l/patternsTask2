import java.util.ArrayList;
import java.util.List;

public class JuegoAventuras {
        public static void main(String[] args) {
        List<Habilidad> habilidadesGuerrero = new ArrayList<>();
        habilidadesGuerrero.add(new Habilidad("Ataque Fuerte"));
        habilidadesGuerrero.add(new Habilidad("Defensa Rápida"));

        Guerrero guerreroOriginal = new Guerrero("Thor", habilidadesGuerrero, 5, 1000);

        // Clonar el guerrero original
        Guerrero clonGuerrero = (Guerrero) guerreroOriginal.clone();
        clonGuerrero.setNombre("Clon de Thor");

        // Personalizar habilidades del clon
        clonGuerrero.getHabilidades().add(new Habilidad("Habilidad Especial"));

        System.out.println("Guerrero Original: " + guerreroOriginal);
        System.out.println("Clon Guerrero: " + clonGuerrero);
    }
}
