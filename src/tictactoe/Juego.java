package tictactoe;

import java.util.Scanner;

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

        System.out.println("Nombre del jugador 1: ");
        jugador1.setNombre(pedirNombre());
        System.out.println("Nombre del jugador 2: ");
        jugador2.setNombre(pedirNombre());
        while (!juegoTerminado){
            tablero.mostrarTablero();
            System.out.println("Turno de " + jugadorActivo.getNombre());
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
                tablero.mostrarTablero();
                System.out.println("¡" + jugadorActivo.getNombre() + " es el ganador!");
            } else {
                cambiarJugador();
                turnos--;
            }
            if(turnos == 0){
                juegoTerminado = true;
                System.out.println("Es un empate.");
            }
        }

    }

    public static String pedirNombre() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void cambiarJugador() {
        jugadorActivo = (jugadorActivo == jugador1) ? jugador2 : jugador1;
    }
}
