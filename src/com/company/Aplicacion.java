package com.company;

;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static Jugable eligeJuego(){
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,5);
        JuegoAdivinaPar juegoPar=new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juegoImpar=new JuegoAdivinaImpar(3,5);
       Jugable[] jugables=new Jugable[3];
       jugables[0]=juego;
       jugables[1]=juegoPar;
       jugables[2]=juegoImpar;
       boolean juegoElegido=false;
       Scanner leer=new Scanner(System.in);
       do{
           System.out.println("Elije que tipo de juego: \n" +
                   "0-Adivina numero \n" +
                   "1-Adivina par \n" +
                   "2-Adivina impar");
           int opcion=leer.nextInt();
           leer.nextLine();
           if (opcion<0 || opcion>2){
               System.out.println("Opcion no valida");
           }else {
               juegoElegido=true;
               return jugables[opcion];

           }
       }while (!juegoElegido);
       return jugables[0];
    }


    public static void main(String[] args) {
      /*  JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,5);
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
        juegoImpar.Juega();*/
        boolean Jugando = true;
        do {
            Jugable juego = eligeJuego();
            juego.muestraNombre();
            juego.muestraInfo();
            juego.Juega();
            System.out.println("¿Quieres volver a jugar?: \n" +
                    "1-Si \n" +
                    "2-No");
            Scanner leer=new Scanner(System.in);
            int opcion=leer.nextInt();
            leer.nextLine();
            if (opcion==2){
                Jugando=false;
            }
        }while (Jugando);
    }
}
