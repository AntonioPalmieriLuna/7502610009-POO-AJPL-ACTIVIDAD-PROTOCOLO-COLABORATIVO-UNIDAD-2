package Taller8.Ejercicio3;

public class Instancias {
    static void main(){
        Empleado empleado = new Empleado("Juan", 1000);
        Gerente gerente = new Gerente("Pedro", 2000,"Recepción");

        empleado.mostrarDetalles();

        System.out.println();

        gerente.mostrarDetalles();
    }
}
