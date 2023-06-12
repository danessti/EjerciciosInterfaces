package AplicacionMusica;

public class Reproductor implements ReproductorMusica {

    private String nombre;

    public Reproductor() {
        this.nombre = "Reproductor MP3";
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        System.out.println("Se esta reproduciendo desde la clase " + nombre);
    }

    @Override
    public void pausar() {
        System.out.println("Se ha pausado desde la clase " + nombre);
    }

    @Override
    public void detener() {
        System.out.println("Se ha detenido desde la clase " + nombre);
    }

}