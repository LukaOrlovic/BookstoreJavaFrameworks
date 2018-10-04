package com.service;

import java.util.List;

import com.domen.Autor;
import com.domen.Knjiga;

public interface KnjizaraService {

	List<Autor> dajAutore();

	void sacuvajAutora(Autor autor);

	void saveKnjiga(Knjiga knjiga);

	Knjiga nadjiKnjigu(int sifraKnjige);

	void izbrisiKnjigu(int sifraKnjige);
}
