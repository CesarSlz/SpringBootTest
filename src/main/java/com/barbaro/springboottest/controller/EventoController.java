package com.barbaro.springboottest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbaro.springboottest.model.Evento;
import com.barbaro.springboottest.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	private EventoService service;
	
	@PostMapping
	public ResponseEntity<Void> createEvento(@RequestBody Evento evento){
		service.crearEvento(evento);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Evento>> readEventos() {
		return new ResponseEntity<List<Evento>>(service.leerEventos(),
				HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public Evento readEvento(@PathVariable("id") String id) {
		return service.leerEvento(id);
	}
	
	@PutMapping("/{id}")
	public Evento updateEvento(@PathVariable("id") String id,
			@RequestBody Evento evento) {
		return service.actualizarEvento(id, evento);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEvento(@PathVariable("id") String id){
		service.eliminarEvento(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}

}
