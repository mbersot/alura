package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.caelum.financas.util.JPAUtil;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
    public String banco; 
    public String agencia;
    public String numero;
        
    public Conta insereConta(String banco, String numero, String agencia) {
   		Conta conta = new Conta();
   		
   		conta.banco = banco;
   		conta.numero = numero;
   		conta.agencia = agencia;
   	   		
   		EntityManager em = new JPAUtil().getEntityManager();
           em.getTransaction().begin();
           em.persist(conta);
           em.getTransaction().commit();
           
        em.close();
        
        return conta;
    
   }
    
	public Conta consultaConta(Integer id) {
		
		EntityManager em = new JPAUtil().getEntityManager();
	    
		em.getTransaction().begin();
	    Conta conta = em.find(Conta.class, id);
		em.getTransaction().commit();
	    
	    em.close();
	
	    return conta;
	
	
	}

	
	
}



