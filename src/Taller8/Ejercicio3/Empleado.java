package Taller8.Ejercicio3;

public class Empleado {
    protected String nombre;
    protected float salario;

    public Empleado(String nombre, float salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre+"\n"+
                "Salario: "+salario);
    }
}
