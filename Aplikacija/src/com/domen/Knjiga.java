package com.domen;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="knjiga")
public class Knjiga {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sifraKnjige")
	private int sifraKnjige;
	
	@Column(name="nazivKnjige")
	private String nazivKnjige;
	
	@Column(name="zanr")
	private String zanr;
	
	@Column(name="cena")
	private double cena;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="idStope", nullable=false)
    private PoreskaStopa poreskaStopa;
    
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="idAutora", nullable=false)
    private Autor autor;
    
    public Knjiga() {
		// TODO Auto-generated constructor stub
	}

	public Knjiga(int sifraKnjige, String nazivKnjige, String zanr,
			double cena, PoreskaStopa poreskaStopa, Autor autor) {
		super();
		this.sifraKnjige = sifraKnjige;
		this.nazivKnjige = nazivKnjige;
		this.zanr = zanr;
		this.cena = cena;
		this.poreskaStopa = poreskaStopa;
		this.autor = autor;
	}

	public int getSifraKnjige() {
		return sifraKnjige;
	}

	public void setSifraKnjige(int sifraKnjige) {
		this.sifraKnjige = sifraKnjige;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public PoreskaStopa getPoreskaStopa() {
		return poreskaStopa;
	}

	public void setPoreskaStopa(PoreskaStopa poreskaStopa) {
		this.poreskaStopa = poreskaStopa;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
    
    
    
    
    
    
	
	
}
