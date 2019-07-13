package javateste;

public class ContaCorrente extends Conta implements Operacoes{
    
    public static final String TIPO_CONTA = "ContaCorrente";
    
    @Override
    public double getSaldo() {
        return this.saldo - ( this.saldo * RegraDesconto.DESC_CONTA_CORRENTE );
    }
    
    @Override
    public double calculaTaxaJuros(){
        JurosConta jurosCC = new JurosContaCorrente();
        return jurosCC.calculaJuros(this.getSaldo());
    }

    @Override
    public void rende() {
        this.saldo*= 1.1;
    }
}
