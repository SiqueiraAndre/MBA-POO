package javateste;

import java.util.HashMap;
import java.util.Map;


public abstract class Cliente {
    private Map<String, Conta> contas;

    public Cliente() {
        contas = new HashMap<>();
    }
    
    public void adicionaConta(String tipoConta, Conta conta){
        contas.put(tipoConta, conta);
    }
    public Conta getConta(String tipoConta){
        if(contas.containsKey(tipoConta)){
            return contas.get(tipoConta);
        }
        return null;
    }

}
