/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoTeste;

/**
 *
 * @author ALUNO
 */
public class Multiplicacao implements Calculo {

    @Override
    public double resultado(Double valor1, Double valor2) {
        return valor1 * valor2;
    }
    
}
