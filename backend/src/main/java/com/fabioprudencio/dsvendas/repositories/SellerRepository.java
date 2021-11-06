package com.fabioprudencio.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioprudencio.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
