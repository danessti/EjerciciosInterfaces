package TiendaLibros;

public class Libro implements Mostrable, Vendible {

    private String titulo;

    private String autor;

    private int precio;

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Titulo: [" + titulo + "] Autor: [" + autor + "] - Precio: [" + precio + "]");
    }

    @Override
    public int obtenerPrecio() {
        return precio;
    }

}