package com.crud.h2.service;

import java.util.List;

import com.crud.h2.model.Hero;

public interface IHeroService {
	public List<Hero> gerAll();

	public Hero listHeroId(int id);

	public int add(Hero hero);

	public int edit(Hero hero);
	
	public List<Hero> search(String word);

	public void delete(int id);

}
