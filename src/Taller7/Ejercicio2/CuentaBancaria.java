package Taller7.Ejercicio2;

public class CuentaBancaria {
    private int numeroCuenta;
    private float saldo;
    String tipoCuenta;

    public CuentaBancaria(int numeroCuenta,float saldo,String tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta=tipoCuenta;
    }

    public void setSaldo(float saldo){
        if(saldo<0){
            this.saldo=0;
        }else{
            this.saldo=saldo;
        }
    }

    public float getSaldo(){
        return saldo;
    }

    public void mostrarInfo(){
        System.out.println("Número de cuenta: "+numeroCuenta+"\n"+
                "Saldo: "+getSaldo()+"\n"+
                "Tipo: "+tipoCuenta);
    }
}
