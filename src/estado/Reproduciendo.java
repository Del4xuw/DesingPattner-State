package estado;

import reproductordemusica.ReproductorMusica;

public class Reproduciendo implements EstadoReproduccion {
    @Override
    public void reproducir(ReproductorMusica reproductor) {
        System.out.println("La música ya está reproduciéndose.");
    }

    @Override
    // Pone la música en pausa y cambia el estado a Pausado
    public void pausar(ReproductorMusica reproductor) {
        System.out.println("Pausando la música.");
        reproductor.setEstado(new Pausado());
    }

    @Override
    public void detener(ReproductorMusica reproductor) {
        System.out.println("Deteniendo la música.");
        reproductor.setEstado(new Detenido());
    }

    @Override
    // Devuelve el nombre del estado actual (Reproduciendo)
    public String obtenerNombreEstado() {
        return "Reproduciendo";
    }
}