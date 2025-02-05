package TresRaya;

import java.util.Scanner;

public class Jugador {
    private Scanner sc = new Scanner(System.in);
    private Tablero tablero;
    private char simbolo;

    public Jugador(char simbolo) {
        this.simbolo = simbolo;
        tablero = new Tablero();
    }

    public char getSimbolo(){
        return simbolo;
    }

    public int[] elegirPosicion() {
        int[] posicion = new int[2];
        int eleccion;
        do {
            System.out.println("Jugador, elija una posición (1-9):");
            eleccion = sc.nextInt();

            if(!tablero.validarPosicion(eleccion)){
                if (eleccion >= 1 && eleccion <= 9){
                    System.out.println("Opción incorrecta. Ingresa un número entre 1 y 9.");
                } else if (){
                    System.out.println("Casilla ocupada.");
                }

            }
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
        } while (!tablero.validarPosicion(eleccion));

        return posicion;
    }



}
