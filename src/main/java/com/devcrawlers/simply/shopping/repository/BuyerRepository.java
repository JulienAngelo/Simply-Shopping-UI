package com.devcrawlers.simply.shopping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devcrawlers.simply.shopping.domain.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {

	public Optional<Buyer> findByIdAndStatus(Long id, String status);

}
