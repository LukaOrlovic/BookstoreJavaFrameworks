package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.domen.PoreskaStopa;

@Repository
public class PoreskaStopaDAOImpl implements PoreskaStopaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<PoreskaStopa> dajStope() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<PoreskaStopa> query = session.createQuery("from PoreskaStopa", PoreskaStopa.class);
		
		List<PoreskaStopa> stope = query.getResultList();
		
		return stope;

	}

	@Override
	@Transactional
	public PoreskaStopa nadjiPoreskuStopu(String poreskaStopa) {
		
		System.out.println(poreskaStopa);
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM PoreskaStopa PS WHERE PS.procenat =:procenat";
		Query<PoreskaStopa> query = session.createQuery(hql, PoreskaStopa.class);
		query.setParameter("procenat", Integer.parseInt(poreskaStopa));
		List<PoreskaStopa> stope = query.getResultList();
		
		return stope.get(0);
		
	}

}
