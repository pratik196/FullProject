package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.WalletDAO;
import com.example.demo.model.Wallet;
import com.example.demo.repository.WalletRepository;

@Service
@Transactional
public class WalletService {

	@Autowired
    private WalletRepository repo;
	
	@Autowired
	private WalletDAO dao;
	
	public Wallet search(int walId) {
		return repo.findById(walId).get();
	}
	
	public List<Wallet> showCustomerWallets(int custId) {
		return dao.showCustomerWallets(custId);
	}
	
	public List<String> getAllWalletTypes(int customerId) {
		return repo.allWalletTypes(customerId);
	}
}
