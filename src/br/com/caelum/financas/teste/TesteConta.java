package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.banco = "Banco do Brasil";
        conta.agencia = "0001";
        conta.numero = "1855";
        
        EntityManager em = new JPAUtil().getEntityManager();
        
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        
        em.close();
        }
}
