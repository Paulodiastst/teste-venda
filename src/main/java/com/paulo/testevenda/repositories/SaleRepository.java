package com.paulo.testevenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.testevenda.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
