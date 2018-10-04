package com.domen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poreskastopa")
public class PoreskaStopa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idStope")
	int idStope;
	
	@Column(name="procenat")
	int procenat;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+procenat;
	}
	

}
