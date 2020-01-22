package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.caelum.financas.util.JPAUtil;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String nome;
	public String profissao;
	public String endereco;
	public boolean isTitular;
	
	@JoinColumn(unique = true)	
	@OneToOne
	public Conta conta;

	public Cliente insereCliente(Conta conta, String endereco, String nome, String profissao, boolean titular){
	
	Cliente cliente = new Cliente();
	
	cliente.conta = conta;
	cliente.endereco = endereco;
	cliente.nome = nome;
	cliente.profissao = profissao;
	cliente.isTitular = titular;
	
	EntityManager em = new JPAUtil().getEntityManager();
    em.getTransaction().begin();
    em.persist(cliente);
    em.getTransaction().commit();
    
    em.close();
 
    return cliente;
	
	}



}
