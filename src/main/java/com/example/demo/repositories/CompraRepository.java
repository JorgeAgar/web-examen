package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Compra;

public interface CompraRepository extends JpaRepository<Compra, Integer> {

}
