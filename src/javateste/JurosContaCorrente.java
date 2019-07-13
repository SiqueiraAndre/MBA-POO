/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javateste;

public class JurosContaCorrente implements JurosConta{

    @Override
    public double calculaJuros(double valor) {
        return valor * RegraJuros.JUROS_CONTA_CORRENTE;
    }
    
}
