package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.caelum.financas.util.JPAUtil;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String texto;
	
	
	public Categoria insereCategoria(String texto){
		
		Categoria categoria = new Categoria();
		
		categoria.texto = texto;
		
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
        
     em.close();
     
     return categoria;
		
	}
}
