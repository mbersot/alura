package br.com.caelum.financas.modelo;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;
import br.com.caelum.financas.util.JPAUtil;


@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	public BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	public tipoMovimentacao tipo;
	
	@Temporal(TemporalType.DATE)
	public Calendar data;
	
	public String descricao;
	
	@ManyToOne
	public Conta conta;
	
	@OneToMany
	public List<Categoria> categorias;

	public void insereMovimentacao(BigDecimal valor, tipoMovimentacao tipo, Calendar data, String descricao,  Conta conta, List<Categoria> categoria) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.valor = valor;
		movimentacao.tipo = tipo;
		movimentacao.data = data;
		movimentacao.descricao = descricao;
		//movimentacao.conta= id_conta;
				
		movimentacao.conta = conta;
		
		movimentacao.categorias = categoria;
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.persist(movimentacao);
        em.getTransaction().commit();
        
        em.close();
        
	}
	
}
