package com.crud.h2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.crud.h2.controller.HeroController;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrudSpringBootH2ApplicationTests {
	
	@Autowired
	private HeroController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
