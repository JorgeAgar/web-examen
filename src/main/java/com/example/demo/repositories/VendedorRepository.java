package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
