package br.com.caelum.financas.teste;



import java.math.BigDecimal;
import java.util.Calendar;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.tipoMovimentacao;

public class TesteJPARelacionamento {

	public static Integer id_conta;
	
	public static void main(String[] args) {

	    Conta salva = new Conta();
	    Conta retorno = salva.insereConta("Itau", "001234", "010102", "Leonardo2");
	    
	    Movimentacao insere = new Movimentacao();
	    	    
	    insere.insereMovimentacao (new BigDecimal("200.0"),tipoMovimentacao.SAIDA ,Calendar.getInstance(), "Churascaria", retorno);  
	   
	}
	

}
