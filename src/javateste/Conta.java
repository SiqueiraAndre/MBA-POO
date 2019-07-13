package javateste;

public abstract class Conta {
    
    public static final String CONTA_CONJUNTA = "ContaConjunta";
    public static final String CONTA_EMPRESARIAL = "ContaEmpresarial";
    public static final String CONTA_SALARIO = "ContaSalario";
    protected double saldo;

    public boolean saca(double valorDoSaque){
        if(getSaldo() < valorDoSaque){
                return false;
        } else {
                saldo = saldo - valorDoSaque;
                return true;
        }
    }

    public void deposita(double valorDepositado){
        saldo = saldo + valorDepositado;
    }

    public abstract double getSaldo();
    public abstract double calculaTaxaJuros();
}
