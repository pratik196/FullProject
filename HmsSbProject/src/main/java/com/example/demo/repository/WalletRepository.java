package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	@Query("select distinct walSource from Wallet where cusId=:cusId")
	public List<String> allWalletTypes(@Param("cusId") int cusId);
}
