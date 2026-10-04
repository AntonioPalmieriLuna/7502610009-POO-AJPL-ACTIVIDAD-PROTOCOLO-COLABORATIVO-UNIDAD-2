package Taller8.Ejercicio1;

public class Instancias {
    static void main(){
        Vehiculo v = new Vehiculo("Toyota", 200);
        v.mostrarInfo();

        System.out.println();

        Coche c = new Coche("Renault", 143, 4);
        c.mostrarInfo();
    }
}
