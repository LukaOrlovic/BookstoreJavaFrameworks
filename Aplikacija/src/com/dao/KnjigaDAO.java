package com.dao;

import java.util.List;

import com.domen.Knjiga;

public interface KnjigaDAO {

	public List<Knjiga> dajKnjige();

	public void saveKnjiga(Knjiga knjiga);

	public Knjiga nadjiKnjigu(int sifraKnjige);

	public void izbrisiKnjigu(int sifraKnjige);
}
