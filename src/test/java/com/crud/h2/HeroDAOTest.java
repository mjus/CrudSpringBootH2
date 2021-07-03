package com.crud.h2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.crud.h2.model.Hero;
import com.crud.h2.modelDAO.HeroDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeroDAOTest {
	
	@Autowired
	private HeroDAO dao;
	
	@Transactional
	@Test
	public void save() {
	  Hero hero = new Hero();
	  hero.setName("Hero for test");
	  int save = dao.add(hero);
	  Assert.assertEquals(1, save);
	  
	}
	
}
