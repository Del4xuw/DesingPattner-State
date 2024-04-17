package estado;
import reproductordemusica.ReproductorMusica;

public interface EstadoReproduccion {
    // Define el método para iniciar la reproducción de la música
    void reproducir(ReproductorMusica reproductor);
    void pausar(ReproductorMusica reproductor);
    void detener(ReproductorMusica reproductor);
    // Define el método para obtener el nombre del estado actual de reproducción
    String obtenerNombreEstado();
}