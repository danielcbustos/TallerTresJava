package ejercicio4.juegodecartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicio4.juegodecartas.interfaces.ISistemaCartas;

public class Baraja {
    List<ISistemaCartas> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        inicializarBaraja();
    }

    public void inicializarBaraja() {
        String[] palos = { "Corazones", "Diamantes", "Picas", "Tréboles" };
        String[] valores = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey" };

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new CartaPoker(palo, valor));
            }
        }
    }

    public void mostrarBaraja() {
        for (ISistemaCartas carta : cartas) {
            carta.mostrarCarta();
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public ISistemaCartas sacarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            return null;
        }
    }
}
