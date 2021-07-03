package com.crud.h2.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.model.Hero;

@Repository
public class HeroDAO implements IHero{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Hero> gerAll() {
		String sql = "select * from hero";
		return template.query(sql, new BeanPropertyRowMapper<Hero>(Hero.class));
	}
	
	@Override
	public List<Hero> search(String word) {
		String sql = "select * from hero where name like " + "\'" + "%" + word+ "%" + "\'";
		return template.query(sql, new BeanPropertyRowMapper<Hero>(Hero.class));
	}

	@Override
	public Hero listHeroId(int id) {
		String sql = "select * from hero where id = ?";
		return template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Hero>(Hero.class));
	}

	@Override
	public int add(Hero hero) {
		String sql = "insert into hero(name)values(?)";
		return template.update(sql, hero.getName());
	}

	@Override
	public int edit(Hero hero) {
		String sql = "update hero set name = ? where id = ?";
		return template.update(sql, hero.getName(), hero.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "delete from hero where id = ?";
		template.update(sql, id);
		
	}

}
