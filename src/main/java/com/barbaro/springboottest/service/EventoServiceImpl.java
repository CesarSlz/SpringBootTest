package com.barbaro.springboottest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbaro.springboottest.dao.EventoRepository;
import com.barbaro.springboottest.model.Evento;

@Service
public class EventoServiceImpl implements EventoService{
	
	@Autowired
	private EventoRepository repository;
	
	@Override
	public void crearEvento(Evento evento) {
		repository.insert(evento);
	}

	@Override
	public List<Evento> leerEventos() {
		return repository.findAll();
	}

	@Override
	public Evento leerEvento(String id) {
		return repository.findById(id).get();
	}

	@Override
	public Evento actualizarEvento(String id, Evento evento) {
		Evento eventoActualizar = leerEvento(id);
		
		eventoActualizar.setTitulo(evento.getTitulo());
		eventoActualizar.setPais(evento.getPais());
		eventoActualizar.setContenido(evento.getContenido());
		eventoActualizar.setFecha(evento.getFecha());
		eventoActualizar.setVistas(evento.getVistas());
		
		return repository.save(eventoActualizar);
	}

	@Override
	public void eliminarEvento(String id) {
		repository.deleteById(id);
		
	}

}
