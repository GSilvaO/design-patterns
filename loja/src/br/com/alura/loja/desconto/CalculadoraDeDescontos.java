package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/**
 * Classe cliente responsável por instanciar os descontos na ordem em
 * que devem ser aplicados. Para isto é implementado o design pattern
 * de Chain of Responsability
 */
public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
