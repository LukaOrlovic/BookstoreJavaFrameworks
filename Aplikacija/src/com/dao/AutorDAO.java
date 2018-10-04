package com.dao;

import java.util.List;

import com.domen.Autor;

public interface AutorDAO {

	public List<Autor> dajAutore();

	public void sacuvajAutora(Autor autor);

	public Autor nadjiAutora(String autor);
}
