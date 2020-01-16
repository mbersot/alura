package br.com.caelum.financas.util;

import br.com.caelum.financas.modelo.Conta;

public class ConsultaConta {
	 public static void main(String[] args) {
		 	Conta conta = new Conta();
		 	Conta result = conta.consultaConta(1);
		 	System.out.print(result.titular);
		 	System.out.print(result.banco);
	 }
}
