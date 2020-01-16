package br.com.caelum.financas.util;

import java.math.BigDecimal;
import java.util.Calendar;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.tipoMovimentacao;

public class PopulaMovimentacaosComCategoria {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta result = conta.consultaConta(2);
		Categoria categoria1 = new Categoria();
		categoria1.insereCategoria("Viagem");
		Categoria categoria2 = new Categoria();
		categoria2.insereCategoria("Negocios");
		
		Movimentacao insereMovimentacao = new Movimentacao();
		insereMovimentacao.insereMovimentacao(new BigDecimal("100.0"), tipoMovimentacao.SAIDA, Calendar.getInstance(), "Viagem a São Paulo", result, categoria1);
		
		
	}

}
