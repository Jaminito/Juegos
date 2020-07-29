package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public abstract class Juego {
    private static int record;
    private int vidas;
    private int vidasIniciales;
    public Juego(int vidas) {
        this.vidas = vidas;
        this.vidasIniciales=vidas;
        record=0;
    }
    public boolean quitaVida(){
        this.vidas--;
       if (this.vidas<=0){
           System.out.println("Juego terminado");
           return false;
       }else {
           return true;
       }
    }
    public void reiniciarPartida(){
        this.vidas=this.vidasIniciales;
    }
    public void actualizarRecord(){
        if (this.vidas==Juego.record){
            System.out.println("Record alcanzado");
        }else if(this.vidas>Juego.record){
            Juego.record=this.vidas;
            System.out.println("Record batido");
        }
    }

    public int mostrarVidas() {
        return vidas;
    }

    public abstract void Juega();

}
