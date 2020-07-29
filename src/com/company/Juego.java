package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Juego {
    public int vidas;

    public Juego(int vidas) {
        this.vidas = vidas;
    }

    public int mostrarVidas() {
        return vidas;
    }
    public static void main(String[] args){
        Juego juego=new Juego(3);
        System.out.println(juego.mostrarVidas());
        juego.vidas-=1;
        System.out.println(juego.mostrarVidas());
        Juego juego2=new Juego(5);
        System.out.println(juego2.mostrarVidas());
        juego2.vidas-=1;
        Juego juego3=new Juego(5);
        System.out.println(juego3.mostrarVidas());
        System.out.println(juego2.mostrarVidas());
    }
}
