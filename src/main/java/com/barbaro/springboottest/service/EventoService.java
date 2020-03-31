package com.barbaro.springboottest.service;

import java.util.List;

import com.barbaro.springboottest.model.Evento;

public interface EventoService {
	
	void crearEvento(Evento evento);
	List<Evento> leerEventos();
	Evento leerEvento(String id);
	Evento actualizarEvento(String id, Evento evento);
	void eliminarEvento(String id);

}
