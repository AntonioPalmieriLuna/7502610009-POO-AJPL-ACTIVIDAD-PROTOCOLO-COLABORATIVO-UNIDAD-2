package Taller8.Ejercicio2;

public class Instancias {
    static void main(){
        Persona persona = new Persona("Juan", 25);
        Estudiante estudiante = new Estudiante("Maria", 20, "123456");
        persona.mostrarInfo();

        System.out.println();

        estudiante.mostrarInfo();
    }
}
