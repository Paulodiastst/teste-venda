package com.paulo.testevenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.testevenda.entities.Sale;
import com.paulo.testevenda.repositories.SaleRepository;

@Service
public class SaleServices {

	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}

}
