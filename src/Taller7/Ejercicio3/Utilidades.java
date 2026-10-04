package Taller7.Ejercicio3;

public class Utilidades {
    int numero1,numero2;

    public Utilidades(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public int sumar(){
        return numero1+numero2;
    }

    public int restar(){
        return numero1-numero2;
    }

    public int multiplicar(){
        return numero1*numero2;
    }

    public int dividir(){
        return numero1/numero2;
    }
}
