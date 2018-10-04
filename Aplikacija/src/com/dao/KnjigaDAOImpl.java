package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.domen.Knjiga;

@Repository
public class KnjigaDAOImpl implements KnjigaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Knjiga> dajKnjige() {

		Session session = sessionFactory.getCurrentSession();

		Query<Knjiga> query = session.createQuery("from Knjiga", Knjiga.class);

		List<Knjiga> knjige = query.getResultList();

		return knjige;

	}

	@Override
	public void saveKnjiga(Knjiga knjiga) {

		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(knjiga);
		
	}

	@Override
	@Transactional
	public Knjiga nadjiKnjigu(int sifraKnjige) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Knjiga knjiga = session.get(Knjiga.class, sifraKnjige);
		
		return knjiga;
		
	}

	@Override
	public void izbrisiKnjigu(int sifraKnjige) {

		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Knjiga where sifraKnjige= :sifra");
		
		query.setParameter("sifra", sifraKnjige);
		
		query.executeUpdate();
		
	}

	
	
	
	
	
	
	
	
	
}
