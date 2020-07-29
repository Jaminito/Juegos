package com.company;

public class Aplicacion {
    public static void main(String[] args){
        Juego juego=new Juego(3);
        System.out.println(juego.mostrarVidas());
        juego.quitaVida();
        System.out.println(juego.mostrarVidas());
        Juego juego2=new Juego(5);
        System.out.println(juego2.mostrarVidas());
        juego2.quitaVida();
        Juego juego3=new Juego(5);
        System.out.println(juego3.mostrarVidas());
        System.out.println(juego2.mostrarVidas());

        juego.quitaVida();
        System.out.println(juego.mostrarVidas());
        juego.reiniciarPartida();
        juego.actualizarRecord();
        juego2.actualizarRecord();

    }
}
