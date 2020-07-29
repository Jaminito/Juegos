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
}
