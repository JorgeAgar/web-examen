package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductoDTO;
import com.example.demo.entities.Producto;
import com.example.demo.entities.TipoProducto;
import com.example.demo.repositories.ProductoRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private TipoProductoService tipoProductoService;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto getProductoById(int id) {
        return productoRepository.getReferenceById(id);
    }
    
    public Producto getProductoByReference(String ref) {
    	List<Producto> todos = getAllProductos();
    	for(Producto p : todos) {
    		if(p.getReferencia().equals(ref))
    			return p;
    	}
    	return null;
    }

    public void addProducto(ProductoDTO dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setCantidad(dto.getCantidad());
        producto.setReferencia(dto.getReferencia());
        TipoProducto tipo = tipoProductoService.getTipoProductoById(dto.getTipoProductoId());
        producto.setTipoProducto(tipo);
        productoRepository.save(producto);
    }
}
