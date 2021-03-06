package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable{
    private int aleatorio;
    public JuegoAdivinaNumero(int vidas,int aleatorio) {
        super(vidas);
        this.aleatorio=aleatorio;
    }

    public boolean validaNumero(int numero){
        return true;
    }
    @Override
    public void Juega() {
        this.reiniciarPartida();
        System.out.println("Adivina el numero entre 0 y 10");
        Scanner leer = new Scanner(System.in);
        boolean juegoAcabado = false;
        int guess = 0;
        do {
            guess = leer.nextInt();
            leer.nextLine();
            if (validaNumero(guess)) {
                if (guess == aleatorio) {
                    System.out.println("Acertaste");
                    actualizarRecord();
                    juegoAcabado = true;
                } else {
                    if (quitaVida()) {
                        if (guess < aleatorio) {
                            System.out.println("El numero es mayor ");
                        } else {
                            System.out.println("El numero es menor ");
                        }
                    } else {
                        juegoAcabado = true;
                    }

                }
            }

        }while (!juegoAcabado) ;
    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina un numero");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Tendras "+mostrarVidas()+" intentos para adivinar un numero entre 0 y 10.");
    }
}
