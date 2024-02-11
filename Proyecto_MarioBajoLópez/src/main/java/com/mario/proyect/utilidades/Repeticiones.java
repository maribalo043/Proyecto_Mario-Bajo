package com.mario.proyect.utilidades;

import java.util.List;

import com.mario.proyect.jugador.Jugador;

public class Repeticiones {

    public static boolean buscarRepeticiones(Jugador numero, Iterable<Jugador> numeros) {
        boolean devolver = true;
        for (Jugador ayuda : numeros) {
            if (ayuda.getDni().equals(numero.getDni())) {
                devolver = false;
                return devolver; 
            }
        }
        return devolver;
    }
    
    
}
