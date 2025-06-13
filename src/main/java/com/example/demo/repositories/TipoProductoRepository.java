package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.TipoProducto;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Integer> {

}
