package br.com.caelum.financas.util;

import br.com.caelum.financas.modelo.Conta;

public class PopulaConta {
		
  public static void main(String[] args) {

		Conta salva = new Conta();
		
		salva.insereConta("Caixa Economica Federal", "123456-8", "0003-4");
		salva.insereConta("Bradesco", "987456-1", "0001-4");
		salva.insereConta("Bamerindus", "561234-1", "0002-4");
		
	}
}