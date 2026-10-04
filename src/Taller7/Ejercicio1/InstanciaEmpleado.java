package Taller7.Ejercicio1;

public class InstanciaEmpleado {
    static void main() {
        Empleado empleado1 = new Empleado("Juan", -13000);
        empleado1.mostrarInfo();

        //acceder a un atributo public sin getter
        System.out.println(empleado1.nombre);
    }
}
