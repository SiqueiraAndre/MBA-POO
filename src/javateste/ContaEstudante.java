package javateste;

public class ContaEstudante extends Conta{
    
    public static final String TIPO_CONTA = "ContaEstudante";
    
    @Override
    public double getSaldo() {
        return this.saldo - ( this.saldo * RegraDesconto.DESC_CONTA_ESTUDANTE );
    }
    
    @Override
    public double calculaTaxaJuros(){
        JurosConta jurosCC = new JurosContaEstudante();
        return jurosCC.calculaJuros(this.getSaldo());
    }
}
