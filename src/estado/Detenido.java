package estado;

import reproductordemusica.ReproductorMusica;

public class Detenido implements EstadoReproduccion {
    @Override
    public void reproducir(ReproductorMusica reproductor) {
        // Inicia la reproducción de la música y cambia el estado a Reproduciendo
        System.out.println("Iniciando la música.");
        reproductor.setEstado(new Reproduciendo());
    }

    @Override
    public void pausar(ReproductorMusica reproductor) {
        System.out.println("La música está detenida, no se puede pausar.");
    }

    @Override
    public void detener(ReproductorMusica reproductor) {
        System.out.println("La música ya está detenida.");
    }

    @Override
    public String obtenerNombreEstado() {
        // Devuelve el nombre del estado actual (Detenido)
        return "Detenido";
    }
}