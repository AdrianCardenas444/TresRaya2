package TresRaya;

import java.util.Scanner;

public class Jugador {
    private final Scanner sc = new Scanner(System.in);
    private final Tablero tablero;
    private char simbolo;

    public Jugador(char simbolo) {
        this.simbolo = simbolo;
        tablero = new Tablero();
    }

    public char getSimbolo() {
        return simbolo;
    }

    public int[] elegirPosicion() {
        int[] posicion = new int[2];
        int eleccion;

        do {
            System.out.println("Elija una posicion (1-9): ");
            eleccion = sc.nextInt();

            if (eleccion < 0 || eleccion > 9){
                System.out.println("Opción no válida.");
            }
        } while(eleccion < 0 || eleccion > 9);
        switch (eleccion) {
            case 1 -> {
                posicion[0] = 0;
                posicion[1] = 0;
            }
            case 2 -> {
                posicion[0] = 0;
                posicion[1] = 1;
            }
            case 3 -> {
                posicion[0] = 0;
                posicion[1] = 2;
            }
            case 4 -> {
                posicion[0] = 1;
                posicion[1] = 0;
            }
            case 5 -> {
                posicion[0] = 1;
                posicion[1] = 1;
            }
            case 6 -> {
                posicion[0] = 1;
                posicion[1] = 2;
            }
            case 7 -> {
                posicion[0] = 2;
                posicion[1] = 0;
            }
            case 8 -> {
                posicion[0] = 2;
                posicion[1] = 1;
            }
            case 9 -> {
                posicion[0] = 2;
                posicion[1] = 2;
            }
        }
        return posicion;
    }
}
