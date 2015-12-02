package modulo13.main;

import modulo13.calculadora.model.Operaciones;
import modulo13.calculadora.view.ImpresionDatos;
import modulo13.calculadora.view.LecturaDatos;

public class TestCalculadora {
    public static void main(String[] args) {
        int numero1 = LecturaDatos.preguntaEntero();
        int numero2 = LecturaDatos.preguntaEntero();
        int suma = Operaciones.suma(numero1, numero2);
        ImpresionDatos.imprimirResultadoSuma(suma);
    }
}
