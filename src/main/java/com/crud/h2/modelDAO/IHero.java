package com.crud.h2.modelDAO;

import java.util.List;

import com.crud.h2.model.Hero;

public interface IHero {
	public List<Hero> gerAll();

	public Hero listHeroId(int id);

	public int add(Hero hero);
	
	public List<Hero> search(String word);

	public int edit(Hero hero);

	public void delete(int id);

}
