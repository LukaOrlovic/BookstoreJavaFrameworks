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
@Table(name="stavkaracuna")
public class StavkaRacuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStavkeRacuna")
	int idStavkeRacuna;
	
	@Column(name = "kolicina")
	int kolicina;
	
	@Column(name = "ukupnaCena")
	double ukupnaCena;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="sifraKnjige", nullable=false)
	Knjiga knjiga;
	
	public StavkaRacuna() {
		// TODO Auto-generated constructor stub
	}


	public StavkaRacuna(int idStavkeRacuna, int kolicina, double ukupnaCena,Knjiga knjiga) {
		
		this.idStavkeRacuna = idStavkeRacuna;
		this.kolicina = kolicina;
		this.ukupnaCena = ukupnaCena;
		this.knjiga = knjiga;
	}



	public int getIdStavkeRacuna() {
		return idStavkeRacuna;
	}

	public void setIdStavkeRacuna(int idStavkeRacuna) {
		this.idStavkeRacuna = idStavkeRacuna;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public Knjiga getKnjiga() {
		return knjiga;
	}

	public void setKnjiga(Knjiga knjiga) {
		this.knjiga = knjiga;
	}
	
	
	
	
	
}
