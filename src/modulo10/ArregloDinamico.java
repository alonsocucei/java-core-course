package modulo10;

import java.util.ArrayList;


public class ArregloDinamico {

    public static void main(String[] args) {
        ArrayList arregloDinamico = new ArrayList();
        
        arregloDinamico.add("Ruben");
        arregloDinamico.add("Juan");
        arregloDinamico.add(0, "Alonso");
        arregloDinamico.add(2, "Fulanito");
        
        arregloDinamico.remove(2);
//        arregloDinamico.remove("Alonso");
        arregloDinamico.set(0, "Menganito");
        System.out.println(arregloDinamico.get(2));
        System.out.println(arregloDinamico);
        System.out.println("El tamaño del arreglo es: " + arregloDinamico.size());
    }
}
