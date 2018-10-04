package com.dao;

import java.util.List;

import com.domen.PoreskaStopa;

public interface PoreskaStopaDAO {

	public List<PoreskaStopa> dajStope();

	public PoreskaStopa nadjiPoreskuStopu(String poreskaStopa);
}
