package com.company;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas, int aleatorio) {
        super(vidas, aleatorio);
    }
    public boolean validaNumero(int numero){
        if (numero%2==0){
            return true;
        }else {
            System.out.println("Error. Numero no par");
            return false;
        }
    }

    public void muestraNombre() {
        System.out.println("Adivina un numero par");
    }

    public void muestraInfo() {
        System.out.println("Tendras "+mostrarVidas()+" intentos para adivinar un numero entre 0 y 10 que sea par.");
    }
}
