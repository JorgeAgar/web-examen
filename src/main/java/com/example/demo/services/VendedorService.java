package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.VendedorDTO;
import com.example.demo.entities.Vendedor;
import com.example.demo.repositories.VendedorRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public List<Vendedor> getAllVendedores() {
        return vendedorRepository.findAll();
    }

    public Vendedor getVendedorById(int id) {
        return vendedorRepository.getReferenceById(id);
    }

    public void addVendedor(VendedorDTO dto) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNombre(dto.getNombre());
        vendedor.setDocumento(dto.getDocumento());
        vendedor.setEmail(dto.getEmail());
        vendedorRepository.save(vendedor);
    }
}
