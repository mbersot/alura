package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String nome;
	public String proficao;
	public String endereco;
	
	@OneToOne
	public Conta conta;

	public Cliente insereCliente(Conta conta, String endereco, String nome, String proficao){
	
	Cliente cliente = new Cliente();
	
	cliente.conta = conta;
	cliente.endereco = endereco;
	cliente.nome = nome;
	cliente.proficao = proficao;
	return cliente;
	
	}



}
