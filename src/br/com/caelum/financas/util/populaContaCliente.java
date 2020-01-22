package br.com.caelum.financas.util;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;

public class populaContaCliente {
	
	public static void main(String[] args) {
		
		Cliente salva = new Cliente();
		
		Conta conta = new Conta();
		//Conta result1 = conta.consultaConta(2);
		Conta result2 = conta.consultaConta(1);
		
		//salva.insereCliente(result1, "Rua Fulano", "Marcus", "Bucha");
		
		salva.insereCliente(result2, "Rua Das flores", "Marcus", "Analista", true);
		
	}

}
