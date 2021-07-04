package br.fuctura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.fuctura.model.Pessoa;
import br.fuctura.util.JPAUtil;

public class Principal {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		
		tx.begin();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("Pedro");
		pessoa.setCpf("112");
		pessoa.setSexo("M");
		pessoa.setDataNasci("290593");
		
		entityManager.persist(pessoa);
		
		tx.commit();
		entityManager.close();
		JPAUtil.close();
		
	}

}
