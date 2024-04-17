package estado;
import reproductordemusica.ReproductorMusica;

public class Pausado implements EstadoReproduccion {
    @Override
    public void reproducir(ReproductorMusica reproductor) {
        // Reanuda la reproducción de la música y cambia el estado a Reproduciendo
        System.out.println("Reproduciendo la música.");
        reproductor.setEstado(new Reproduciendo());
    }

    @Override
    public void pausar(ReproductorMusica reproductor) {
        System.out.println("La música ya está pausada.");
    }

    @Override
    public void detener(ReproductorMusica reproductor) {
        System.out.println("Deteniendo la música desde pausa.");
        reproductor.setEstado(new Detenido());
    }

    @Override
    // Devuelve el nombre del estado actual (Pausado)
    public String obtenerNombreEstado() {
        return "Pausado";
    }
}