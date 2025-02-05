package TresRaya;

public class Juego {
    private Tablero tablero;
    private Jugador jugadorAccion;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActivo;

    public Juego(){
        tablero = new Tablero();
        jugador1 = new Jugador('X');
        jugador2 = new Jugador('O');
        jugadorActivo = jugador1;
    }

    public void iniciarJuego(){
        tablero.mostrarTablero();
        jugadorAccion.elegirPosicion();

    }

    public void cambiarJugador(){
        //si no hay ganador cmabia de jugador
    }

}
