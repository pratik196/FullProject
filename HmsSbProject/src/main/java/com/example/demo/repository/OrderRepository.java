package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Orders;


public interface OrderRepository extends JpaRepository<Orders, Integer>{

//	List<Orders> customerOrders(int cusId);
//	List<Orders> vendorOrders(int venId);;
}
