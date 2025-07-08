package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto15PorCento;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		ItemOrcamento itemOrcamento = new ItemOrcamento(new BigDecimal("400"));

		orcamento.adicionarItem(itemOrcamento);

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		BigDecimal valorDoImposto = calculadora.calcular(orcamento, new ISS(
																	new ICMS(
																	new Imposto15PorCento(null)))); 
		
		System.out.println(valorDoImposto);
	}
}
