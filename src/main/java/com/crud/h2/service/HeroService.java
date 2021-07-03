package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.model.Hero;
import com.crud.h2.modelDAO.IHero;

@Service
public class HeroService implements IHeroService {
	
	@Autowired
	private IHero dao;

	@Override
	public List<Hero> gerAll() {
		return dao.gerAll();
	}

	@Override
	public Hero listHeroId(int id) {
		return dao.listHeroId(id);
	}

	@Override
	public int add(Hero hero) {
		return dao.add(hero);
	}

	@Override
	public int edit(Hero hero) {
		return dao.edit(hero);
	}
	
	@Override
	public List<Hero> search(String word) {
		return dao.search(word);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);

	}

}
