package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {

		ItemOrcamento primeiroItem = new ItemOrcamento(new BigDecimal("400"));
		ItemOrcamento segundoItem = new ItemOrcamento(new BigDecimal("1000"));
		Orcamento orcamentoPrimeiroItem = new Orcamento();
		Orcamento orcamentoSegundoItem = new Orcamento();
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		for(int i = 0; i < 5; i++) {
			orcamentoPrimeiroItem.adicionarItem(primeiroItem);
		}

		orcamentoSegundoItem.adicionarItem(segundoItem);
		
		System.out.println(calculadora.calcular(orcamentoPrimeiroItem));
		System.out.println(calculadora.calcular(orcamentoSegundoItem));
	}
}
