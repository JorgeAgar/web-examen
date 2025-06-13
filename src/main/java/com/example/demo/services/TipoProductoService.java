package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TipoProductoDTO;
import com.example.demo.entities.TipoProducto;
import com.example.demo.repositories.TipoProductoRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class TipoProductoService {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    public List<TipoProducto> getAllTipoProductos() {
        return tipoProductoRepository.findAll();
    }

    public TipoProducto getTipoProductoById(int id) {
        return tipoProductoRepository.getReferenceById(id);
    }

    public void addTipoProducto(TipoProductoDTO dto) {
        TipoProducto tipo = new TipoProducto();
        tipo.setNombre(dto.getNombre());
        tipoProductoRepository.save(tipo);
    }
}
