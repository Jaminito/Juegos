package com.company;

public class Aplicacion {
 /*   public static Jugable eligeJuego(){
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,5);
        JuegoAdivinaPar juegoPar=new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juegoImpar=new JuegoAdivinaImpar(3,5);
    } */


    public static void main(String[] args) {
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,5);
        JuegoAdivinaPar juegoPar=new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juegoImpar=new JuegoAdivinaImpar(3,5);

        juego.muestraNombre();
        juego.muestraInfo();
        juego.Juega();

        juegoPar.muestraNombre();
        juegoPar.muestraInfo();
        juegoPar.Juega();

        juegoImpar.muestraNombre();
        juegoImpar.muestraInfo();
        juegoImpar.Juega();
    }
}
