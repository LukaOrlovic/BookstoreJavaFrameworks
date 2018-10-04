package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AutorDAO;
import com.dao.KnjigaDAO;
import com.domen.Autor;
import com.domen.Knjiga;

@Service
public class KnjizaraServiceImpl implements KnjizaraService {

	
	@Autowired
	private AutorDAO autorDao;
	
	@Autowired
	private KnjigaDAO knjigaDao;
	
	
	@Override
	@Transactional
	public List<Autor> dajAutore() {
		return autorDao.dajAutore();
	}


	@Override
	@Transactional
	public void sacuvajAutora(Autor autor) {
		
		autorDao.sacuvajAutora(autor);
		
	}


	@Override
	@Transactional
	public void saveKnjiga(Knjiga knjiga) {

		knjigaDao.saveKnjiga(knjiga);
	}


	@Override
	public Knjiga nadjiKnjigu(int sifraKnjige) {
		
		return knjigaDao.nadjiKnjigu(sifraKnjige);
	}


	@Override
	@Transactional
	public void izbrisiKnjigu(int sifraKnjige) {
		
		knjigaDao.izbrisiKnjigu(sifraKnjige);
		
	}
	
	

}
