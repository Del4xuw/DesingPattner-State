package reproductordemusica;
import estado.EstadoReproduccion;
import estado.Detenido;

public class ReproductorMusica {
    private EstadoReproduccion estadoActual;

    public ReproductorMusica() {
        estadoActual = new Detenido();
    }

    public void reproducir() {
        estadoActual.reproducir(this);
    }

    public void pausar() {
        estadoActual.pausar(this);
    }

    public void detener() {
        estadoActual.detener(this);
    }

    public void mostrarEstado() {
        System.out.println("Estado actual: " + estadoActual.obtenerNombreEstado());
    }
//se utiliza para asignar el valor del parámetro nuevoEstado al atributo estadoActual del objeto actual
    public void setEstado(EstadoReproduccion nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }
}
