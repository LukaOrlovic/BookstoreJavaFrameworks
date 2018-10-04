package com.domen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prodavac")
public class Prodavac {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProdavca")
	private int idProdavca;

	@Column(name = "ime")
	private String ime;

	@Column(name = "prezime")
	private String prezime;

	@Column(name = "lozinka")
	private String lozinka;

	public Prodavac() {
		// TODO Auto-generated constructor stub
	}

	public int getIdProdavca() {
		return idProdavca;
	}

	public void setIdProdavca(int idProdavca) {
		this.idProdavca = idProdavca;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
	@Override
	public String toString() {

		return ime + " " + prezime;
	}
	
	

}
