package com.domen;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "racun")
public class Racun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRacuna")
	int idRacuna;

	@Column(name = "ukupanIznos")
	double ukupanIznos;

	@Column(name = "datum")
	Date datum;

	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="idProdavca", nullable=false)
	Prodavac prodavac;

	@OneToMany(cascade=CascadeType.ALL)  
    @MapKey(name="idRacuna")
    @Column(name="idStavkeRacuna")
	List<StavkaRacuna> stavke;

	public Racun() {
		// TODO Auto-generated constructor stub
	}

	

	public Racun(int idRacuna, double ukupanIznos, Date datum,
			Prodavac prodavac, List<StavkaRacuna> stavke) {
		super();
		this.idRacuna = idRacuna;
		this.ukupanIznos = ukupanIznos;
		this.datum = datum;
		this.prodavac = prodavac;
		this.stavke = stavke;
	}



	public int getIdRacuna() {
		return idRacuna;
	}

	public void setIdRacuna(int idRacuna) {
		this.idRacuna = idRacuna;
	}

	public double getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(double ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public List<StavkaRacuna> getStavke() {
		return stavke;
	}

	public void setStavke(List<StavkaRacuna> stavke) {
		this.stavke = stavke;
	}

	public Prodavac getProdavac() {
		return prodavac;
	}

	public void setProdavac(Prodavac prodavac) {
		this.prodavac = prodavac;
	}

	
}
