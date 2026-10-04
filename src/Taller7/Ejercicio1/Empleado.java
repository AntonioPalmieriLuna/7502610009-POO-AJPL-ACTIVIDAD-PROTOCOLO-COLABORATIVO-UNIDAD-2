package Taller7.Ejercicio1;

public class Empleado {
    String nombre;
    float salario;


    public Empleado(String nombre,float salario){
        this.nombre = nombre;
        setSalario(salario);
    }

    public void setSalario(float salario) {
        if(salario > 0) {
            this.salario = salario;
        }else{
            this.salario = 0;
        }
    }

    public float getSalario() {
        return salario;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre+"\n"+
                "Salario: " + salario);
    }

}
