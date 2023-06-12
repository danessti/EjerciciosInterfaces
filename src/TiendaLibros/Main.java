package TiendaLibros;

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro("El Libro Sin Nombre", "Anonimo", 80000);
        Libro libro1 = new Libro("Un Beso Bajo Las Estrellas", "Sophsvc", 120000);

        libro.mostrarInfo();
        System.out.println("El precio del libro es de " + libro.obtenerPrecio() + "\n");
        libro1.mostrarInfo();
        System.out.println("El precio del libro es de " + libro1.obtenerPrecio() + "\n");

    }

}