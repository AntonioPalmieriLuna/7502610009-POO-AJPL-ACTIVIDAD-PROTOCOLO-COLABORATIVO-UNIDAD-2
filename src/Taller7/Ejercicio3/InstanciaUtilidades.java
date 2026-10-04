package Taller7.Ejercicio3;

public class InstanciaUtilidades {
    static void main() {
        Utilidades utilidades = new Utilidades(5, 3);
        System.out.println("Suma: " + utilidades.sumar());
        System.out.println("Resta: " + utilidades.restar());
        System.out.println("Multiplicación: " + utilidades.multiplicar());
        System.out.println("División: " + utilidades.dividir());
    }
}
