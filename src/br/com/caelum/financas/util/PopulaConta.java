package br.com.caelum.financas.util;

import br.com.caelum.financas.modelo.Conta;

public class PopulaConta {
		
  public static void main(String[] args) {

		Conta salva = new Conta();
		salva.insereConta("443 - BANCO DO ESTADO", "1888-3", "00011", "Marcus Bersot");
		salva.insereConta("237 - BANCO BANESTADO", "67896-1", "00012", "Felipe Santos");
		salva.insereConta("341 - BANCO BAMERINDOS", "12345-3", "00013", "Maria Gabriela");
		
	}
}