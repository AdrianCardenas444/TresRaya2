package TresRaya;

public class Juego {
    private Tablero tablero;
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
        int turnos = 9;
        boolean juegoTerminado = false;

        while (!juegoTerminado){
            tablero.mostrarTablero();
            System.out.println("Turno del jugador " + jugadorActivo.getSimbolo());
            int[] posicion;

            do {
              posicion = jugadorActivo.elegirPosicion();
              if (!tablero.validarPosicion(posicion[0],posicion[1])){
                  System.out.println("Casilla ocupada.");
              }
            }while (!tablero.validarPosicion(posicion[0],posicion[1]));
            tablero.jugada(posicion, jugadorActivo.getSimbolo());
            if (tablero.comprobarVictoria(jugadorActivo.getSimbolo())){
                juegoTerminado = true;
            } else {
                cambiarJugador();
                turnos--;
            }
            if(turnos == 0){
                juegoTerminado = true;
            }
        }
    }

    public void cambiarJugador() {
        //si no hay ganador cmabia de jugador
        jugadorActivo = (jugadorActivo == jugador1) ? jugador2 : jugador1;
    }
}
