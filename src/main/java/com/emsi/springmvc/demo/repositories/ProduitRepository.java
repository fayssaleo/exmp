package com.emsi.springmvc.demo.repositories;

import com.emsi.springmvc.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
