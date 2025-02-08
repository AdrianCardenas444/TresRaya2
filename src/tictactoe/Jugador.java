package tictactoe;

import java.util.Scanner;

public class Jugador {
    private static final Scanner sc = new Scanner(System.in);
    final Tablero tablero;
    private char simbolo;
    private String nombre;

    public Jugador( char simbolo) {
        this.simbolo = simbolo;
        nombre = "";
        tablero = new Tablero();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){ return nombre;}

    public char getSimbolo() {
        return simbolo;
    }

    public int[] elegirPosicion() {
        int[] posicion = new int[2];
        int eleccion;

        do {
            System.out.println("Elija una posicion (1-9): ");
            eleccion = sc.nextInt();

            if (eleccion < 1 || eleccion > 9){
                System.out.println("Opción no válida.");
            }

        } while(eleccion < 1 || eleccion > 9);
        posicion[0] = (eleccion - 1) / 3;
        posicion[1] = (eleccion - 1) % 3;
        return posicion;
    }
}
