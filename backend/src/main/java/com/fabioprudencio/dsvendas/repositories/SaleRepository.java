package com.fabioprudencio.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioprudencio.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
