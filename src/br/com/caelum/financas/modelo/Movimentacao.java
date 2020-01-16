package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.caelum.financas.util.JPAUtil;


@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	public BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	public tipoMovimentacao tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar data;
	
	public String descricao;
	
	@ManyToOne
	public Conta conta;
	
	@OneToMany
	public Categoria categoria;

	public void insereMovimentacao(BigDecimal valor, tipoMovimentacao tipo, Calendar data, String descricao,  Conta conta, Categoria categoria) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.valor = valor;
		movimentacao.tipo = tipo;
		movimentacao.data = data;
		movimentacao.descricao = descricao;
		//movimentacao.conta= id_conta;
				
		movimentacao.conta = conta;
		
		movimentacao.categoria = categoria;
		
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.persist(movimentacao);
        em.getTransaction().commit();
        
        em.close();
        
	}
	
}
