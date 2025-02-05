package TresRaya;

public class TresRaya {

    public static void main(String[] args) {
        Juego juego = new Juego();
        System.out.println("Posiciones del tablero: ");
        System.out.println("1 | 2 | 3 \n--------\n4 | 5 | 6\n--------\n7 | 8 | 9\n");

        juego.iniciarJuego();
    }
}
