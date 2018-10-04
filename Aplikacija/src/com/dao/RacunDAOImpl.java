package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.domen.Racun;

@Repository
public class RacunDAOImpl implements RacunDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Racun> dajRacune() {
		
		Session session = sessionFactory.getCurrentSession();

		Query<Racun> query = session.createQuery("from Racun", Racun.class);

		List<Racun> racuni = query.getResultList();

		return racuni;
	}

}
