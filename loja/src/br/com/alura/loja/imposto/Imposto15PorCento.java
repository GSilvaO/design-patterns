package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Imposto15PorCento extends Imposto {

    public Imposto15PorCento(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.15"));
    }

}
