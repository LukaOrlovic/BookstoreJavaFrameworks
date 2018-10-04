package com.domen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAutora")
	public int idAutora;
	
	@Column(name="imePrezime")
	String imePrezime;
	
	@Column(name="pol")
	char pol;
	
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imePrezime;
	}

	public int getIdAutora() {
		return idAutora;
	}

	public void setIdAutora(int idAutora) {
		this.idAutora = idAutora;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public char getPol() {
		return pol;
	}

	public void setPol(char pol) {
		this.pol = pol;
	}
	
	

	
	
	
	
}
