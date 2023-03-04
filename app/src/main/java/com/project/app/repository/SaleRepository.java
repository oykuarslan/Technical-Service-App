package com.project.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.app.model.Sale;


@Repository
public interface SaleRepository extends JpaRepository<Sale,Long>{

	List<Sale> findAllByProductIdAndIsSold(Long id, boolean isSold);

	@Query(name = "FindProductByName", value = "SELECT p FROM Sale p WHERE p.product.name LIKE CONCAT ('%',:name,'%')")
	List<Sale> FindProductByName(String name);

	boolean findAllByIsSold(boolean isSold );
}
