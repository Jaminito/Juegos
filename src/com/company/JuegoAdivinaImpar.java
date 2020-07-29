package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas, int aleatorio) {
        super(vidas, aleatorio);
    }
    public boolean validaNumero(int numero){
        if (numero%2!=0){
            return true;
        }else {
            System.out.println("Error. Numero no impar");
            return false;
        }
    }
}
