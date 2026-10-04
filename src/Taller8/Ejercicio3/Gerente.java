package Taller8.Ejercicio3;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, float salario,String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
}
