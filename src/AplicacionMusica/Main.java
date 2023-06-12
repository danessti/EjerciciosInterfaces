package AplicacionMusica;

public class Main {

    public static void main(String[] args) {

        Reproductor mp3 = new Reproductor();

        mp3.reproducir();
        mp3.pausar();
        mp3.detener();

        ReproductorWalkman walkman = new ReproductorWalkman();

        walkman.reproducir();
        walkman.pausar();
        walkman.detener();

    }

}