package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepository;



@Service
@Transactional
public class MenuService {

	@Autowired
    private MenuRepository repo;
	
	public Menu search(int menuId) {
		return repo.findById(menuId).get();
	}
	public List<Menu> showEmploy() {
		return repo.findAll();
	}
}
