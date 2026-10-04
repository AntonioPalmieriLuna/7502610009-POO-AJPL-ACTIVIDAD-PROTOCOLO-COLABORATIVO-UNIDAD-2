package Taller8.Ejercicio4;

// Error: Java no permite herencia múltiple de clases, solo se puede usar extends con una clase.
//public class Perro extends Animal, Mascota{
public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }

    public void mostrarInfo(){
        // Error: nombre tiene acceso private en Animal, solo es visible dentro de esa clase.
        //System.out.println("Nombre: "+nombre);
        System.out.println("Nombre: "+getNombre()+"\n"+
                "Raza: "+raza);
    }
}
