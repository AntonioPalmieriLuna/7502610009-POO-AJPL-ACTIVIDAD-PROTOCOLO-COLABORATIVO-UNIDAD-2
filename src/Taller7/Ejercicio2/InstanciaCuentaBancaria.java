package Taller7.Ejercicio2;

public class InstanciaCuentaBancaria {
    static void main() {
        CuentaBancaria cuenta1=new CuentaBancaria(123456,1000,"Ahorros");
        cuenta1.mostrarInfo();

        //tratando de acceder a numeroCuenta directamente
//        System.out.println("Número de cuenta: "+cuenta1.numeroCuenta);
        //Se genera error, porque es privado ese atributo

        //manera correcta de acceder, con ejemplo del atributo saldo
        System.out.println("Saldo: "+cuenta1.getSaldo());
    }
}
