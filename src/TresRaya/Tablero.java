package TresRaya;

public class Tablero {
    private char[][] tablero;

    public Tablero() { //esto es un constructor
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero(){
        for(int i = 0; i < 3; i++){
            System.out.println(tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2){
                System.out.println("--------");
            }
        }
    }

    public boolean validarPosicion(int eleccion){
        return eleccion >= 1 && eleccion <= 9;
    }

    public void jugada(int[] posicion, char simbolo){
        int fila = posicion[0];
        int columna = posicion[1];
        tablero[fila][columna] = simbolo;
    }

    public boolean comprobarVictoria(char simbolo){
        for (int i = 0; i < 3; i++){ //filas
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo){
                return true;
            }

        }
    }
}
