package com.crud.h2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.model.Hero;
import com.crud.h2.service.IHeroService;

@RestController
public class HeroController {
	
	@Autowired
	private IHeroService service;
	
	@GetMapping("/hero")
	public List<Hero> getAll(){
		return service.gerAll();
	}
	
	@PostMapping("/save")
	public int save(@Valid Hero hero) {
		return service.add(hero);
	}
	
	@PutMapping("/edit")
	public int edit(@RequestBody Hero hero) {
		return service.edit(hero);
	}
	
	@GetMapping("/hero/{id}")
	public Hero viewHero(@PathVariable int id) {
		return service.listHeroId(id);
	}
	
	@GetMapping("/hero/search")
	public List<Hero> searchHeroByWord(@RequestParam String word) {
		return service.search(word);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}
