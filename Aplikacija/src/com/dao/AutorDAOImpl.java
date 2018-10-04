package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.domen.Autor;

@Repository
public class AutorDAOImpl implements AutorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Autor> dajAutore() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Autor> query = session.createQuery("from Autor", Autor.class);
		
		List<Autor> autori = query.getResultList();
		
		return autori;
	}


	@Override
	public void sacuvajAutora(Autor autor) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(autor);
		
	}


	@Override
	@Transactional
	public Autor nadjiAutora(String autor) {

		System.out.println(autor);
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM Autor a WHERE a.imePrezime =:ime";
		Query<Autor> query = session.createQuery(hql, Autor.class);
		query.setParameter("ime", autor);
		List<Autor> autori = query.getResultList();
		
		return autori.get(0);
	}

}
