package com.company;

public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,5);
        JuegoAdivinaPar juegoPar=new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juegoImpar=new JuegoAdivinaImpar(3,5);
        juego.Juega();
        juegoPar.Juega();
        juegoImpar.Juega();
    }
}
