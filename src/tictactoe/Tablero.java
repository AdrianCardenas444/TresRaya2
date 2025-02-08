package tictactoe;

public class Tablero {
    private char[][] tablero;

    public Tablero() { // constructor del tablero
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero() { //print del tablero
        for (int i = 0; i < 3; i++) {
            System.out.println(tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) {
                System.out.println("--------");
            }
        }
    }

    public boolean validarPosicion(int fila, int columna) {
        return (tablero[fila][columna] == ' ');
    }

    public void jugada(int[] posicion, char simbolo) {
        int fila = posicion[0];
        int columna = posicion[1];
        tablero[fila][columna] = simbolo;
    }

    public boolean comprobarVictoria(char simbolo) {
        for (int i = 0; i < 3; i++) { //filas
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
            for (int j = 0; j < 3; j++) { //columnas
                if (tablero[0][j] == simbolo && tablero[1][j] == simbolo && tablero[2][j] == simbolo) {
                    return true;
                }
            }
        }
        return (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) || tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo;
    }
}
