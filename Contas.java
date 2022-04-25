public class Contas{
    
    private int numero = 192;
    private double saldo = 2000;

    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

 //acessar com métodos públicos

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

}
