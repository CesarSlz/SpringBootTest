package com.barbaro.springboottest.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Evento {
	
	@Id
	private String id;
	private String titulo;
	private String contenido;
	private String pais;
	private Date fecha;
	private Integer vistas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getVistas() {
		return vistas;
	}
	public void setVistas(Integer vistas) {
		this.vistas = vistas;
	}
	
}
