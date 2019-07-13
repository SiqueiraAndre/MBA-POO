package javateste;


public class JavaTeste {

    public static void main(String[] args) {
        System.out.println("###### ESTUDANTE #####");
        Cliente cliente = new ClienteFisico();
        Conta conta = new ContaEstudante();
        cliente.adicionaConta(ContaEstudante.TIPO_CONTA, conta);
        cliente.getConta(ContaEstudante.TIPO_CONTA).deposita(2500.0);
        System.out.println(cliente.getConta(ContaEstudante.TIPO_CONTA).getSaldo());
        System.out.println(cliente.getConta(ContaEstudante.TIPO_CONTA).calculaTaxaJuros());
        
        System.out.println("\n###### CONTA CORRENTE #####");
        conta = new ContaCorrente();
        cliente.adicionaConta(ContaCorrente.TIPO_CONTA, conta);
        cliente.getConta(ContaCorrente.TIPO_CONTA).deposita(2500.0);
        System.out.println(cliente.getConta(ContaCorrente.TIPO_CONTA).getSaldo());
        System.out.println(cliente.getConta(ContaCorrente.TIPO_CONTA).calculaTaxaJuros());
    }    
}
