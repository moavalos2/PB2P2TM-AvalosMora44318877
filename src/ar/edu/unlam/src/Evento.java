package ar.edu.unlam.src;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	private String nombre;
	private Usuario usuario;
	
	private List<Usuario> usuarios;
	
	public Evento(Usuario usuario) {
		this.usuario = usuario;
		this.usuarios = new ArrayList<>();
	}

	public Usuario getOrganizador() {
		return this.usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void addUser(Agasajado agasajado) {
		this.usuarios.add(agasajado);
		
	}
	
	

}
