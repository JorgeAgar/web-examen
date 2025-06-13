package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CajeroDTO;
import com.example.demo.entities.Cajero;
import com.example.demo.entities.Tienda;
import com.example.demo.repositories.CajeroRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class CajeroService {

	@Autowired
	private CajeroRepository cajeroRepository;
	
	@Autowired
	private TiendaService tiendaService;
	
	public List<Cajero> getAllCajeros() {
		return cajeroRepository.findAll();
	}
	
	public Cajero getCajeroByToken(String token) {
		List<Cajero> todos = getAllCajeros();
		for(Cajero c : todos) {
			if(c.getToken().equals(token))
				return c;
		}
		return null;
	}
	
	public Cajero getCajeroById(int id) {
		return cajeroRepository.getReferenceById(id);
	}
	
	public void addCajero(CajeroDTO cajeroDTO) {
		Cajero cajero = new Cajero();
		cajero.setDocumento(cajeroDTO.getDocumento());
		cajero.setEmail(cajeroDTO.getEmail());
		cajero.setNombre(cajeroDTO.getNombre());
		cajero.setToken(cajeroDTO.getToken());
		Tienda tienda = tiendaService.getTiendaById(cajeroDTO.getTiendaId());
		cajero.setTienda(tienda);
		cajeroRepository.save(cajero);
	}
}
